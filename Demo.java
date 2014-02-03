package com.bethanymsimmons.air;

import java.net.UnknownHostException;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.Morphia;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class Demo {

	public static void main(String[] args) throws UnknownHostException, MongoException {

		String dbName = "annotations";
		MongoClient mongo = new MongoClient();
		Morphia morphia = new Morphia();

		AnnotationsDAO acDAO = new AnnotationsDAO(mongo, morphia, dbName);
		
		Annotations ac = new Annotations();
		
		RectangleAnnotation ra = new RectangleAnnotation();
		ra.setType("heart");
		
		ac.addAnnotation(ra);
		
		
		PointAnnotation pa = new PointAnnotation();
		ac.addAnnotation(pa);
		
		acDAO.save(ac);
		
		ObjectId id = ac.getId();
		System.out.println("id = " + id.toString());

		Annotations newAc = acDAO.get(id);
		id = newAc.getId();
		System.out.println("newId = " + id.toString());
		
		

	}

}
