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

		AnnotationContainerDAO acDAO = new AnnotationContainerDAO(mongo, morphia, dbName);
		
		AnnotationContainer ac = new AnnotationContainer();
		
		acDAO.save(ac);
		
		ObjectId newId = ac.getId();
		System.out.println("id = " + newId.toString());
		

	}

}
