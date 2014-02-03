package com.bethanymsimmons.air;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.annotations.Embedded;
import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;

@Entity 
public class Annotations {

	@Id 
	private ObjectId id;
	
	@Embedded 
	private List<Annotation> annotations;
	
	public Annotations() {
		annotations = new ArrayList<Annotation>();
	}
	
	public ObjectId getId() {
		return id;
	}
	
	public void addAnnotation(Annotation annotion) {
		annotations.add(annotion);
	}
}
