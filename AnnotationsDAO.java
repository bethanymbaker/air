package com.bethanymsimmons.air;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.Morphia;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;

public class AnnotationsDAO extends BasicDAO<Annotations, ObjectId> {

	protected AnnotationsDAO(MongoClient mongo, Morphia morphia, String dbName) {
		super(mongo, morphia, dbName);
	}

}
