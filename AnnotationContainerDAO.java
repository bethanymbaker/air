package com.bethanymsimmons.air;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.Morphia;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;

public class AnnotationContainerDAO extends BasicDAO<AnnotationContainer, ObjectId> {

	protected AnnotationContainerDAO(MongoClient mongo, Morphia morphia, String dbName) {
		super(mongo, morphia, dbName);
	}

}
