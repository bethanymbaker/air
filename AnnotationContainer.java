package com.bethanymsimmons.air;

import java.util.List;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.annotations.Embedded;
import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;

@Entity public class AnnotationContainer {

	@Id private ObjectId id;
	
	@Embedded private List<Annotation> annotations;
	
	public ObjectId getId() {
		return id;
	}
}
