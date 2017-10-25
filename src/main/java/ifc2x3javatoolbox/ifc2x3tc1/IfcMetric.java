/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcMetric<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcMetric extends IfcConstraint implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcConstraintEnum","IfcLabel","IfcActorSelect","IfcDateTimeSelect","IfcLabel","IfcBenchmarkEnum","IfcLabel","IfcMetricValueSelect"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Benchmark is an DEMANDED attribute - may not be null**/
	protected IfcBenchmarkEnum Benchmark;
	/** ValueSource is an OPTIONAL attribute**/
	protected IfcLabel ValueSource;
	/** DataValue is an DEMANDED attribute - may not be null**/
	protected IfcMetricValueSelect DataValue;
	/**
	* The default constructor.
	**/
	public IfcMetric(){}

	private static final String[] attributes = new String[]{"Name","Description","ConstraintGrade","ConstraintSource"
			,"CreatingActor","CreationTime","UserDefinedGrade","Benchmark","ValueSource","DataValue"};

	public String[] getAttributes() {
		return IfcMetric.attributes;
	}

	/**
	* Constructs a new IfcMetric object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConstraintGrade DEMANDED parameter of type IfcConstraintEnum - may not be null.
	* @param ConstraintSource OPTIONAL parameter of type IfcLabel
	* @param CreatingActor OPTIONAL parameter of type IfcActorSelect
	* @param CreationTime OPTIONAL parameter of type IfcDateTimeSelect
	* @param UserDefinedGrade OPTIONAL parameter of type IfcLabel
	* @param Benchmark DEMANDED parameter of type IfcBenchmarkEnum - may not be null.
	* @param ValueSource OPTIONAL parameter of type IfcLabel
	* @param DataValue DEMANDED parameter of type IfcMetricValueSelect - may not be null.
	**/
	public IfcMetric(IfcLabel Name, IfcText Description, IfcConstraintEnum ConstraintGrade, IfcLabel ConstraintSource, IfcActorSelect CreatingActor, IfcDateTimeSelect CreationTime, IfcLabel UserDefinedGrade, IfcBenchmarkEnum Benchmark, IfcLabel ValueSource, IfcMetricValueSelect DataValue)
	{
		this.Name = Name;
		this.Description = Description;
		this.ConstraintGrade = ConstraintGrade;
		this.ConstraintSource = ConstraintSource;
		this.CreatingActor = CreatingActor;
		this.CreationTime = CreationTime;
		this.UserDefinedGrade = UserDefinedGrade;
		this.Benchmark = Benchmark;
		this.ValueSource = ValueSource;
		this.DataValue = DataValue;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcMetric object using the given parameters.
	*
	* @param Name DEMANDED parameter of type IfcLabel - may not be null.
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConstraintGrade DEMANDED parameter of type IfcConstraintEnum - may not be null.
	* @param ConstraintSource OPTIONAL parameter of type IfcLabel
	* @param CreatingActor OPTIONAL parameter of type IfcActorSelect
	* @param CreationTime OPTIONAL parameter of type IfcDateTimeSelect
	* @param UserDefinedGrade OPTIONAL parameter of type IfcLabel
	* @param Benchmark DEMANDED parameter of type IfcBenchmarkEnum - may not be null.
	* @param ValueSource OPTIONAL parameter of type IfcLabel
	* @param DataValue DEMANDED parameter of type IfcMetricValueSelect - may not be null.
	**/
	public void setParameters(IfcLabel Name, IfcText Description, IfcConstraintEnum ConstraintGrade, IfcLabel ConstraintSource, IfcActorSelect CreatingActor, IfcDateTimeSelect CreationTime, IfcLabel UserDefinedGrade, IfcBenchmarkEnum Benchmark, IfcLabel ValueSource, IfcMetricValueSelect DataValue)
	{
		this.Name = Name;
		this.Description = Description;
		this.ConstraintGrade = ConstraintGrade;
		this.ConstraintSource = ConstraintSource;
		this.CreatingActor = CreatingActor;
		this.CreationTime = CreationTime;
		this.UserDefinedGrade = UserDefinedGrade;
		this.Benchmark = Benchmark;
		this.ValueSource = ValueSource;
		this.DataValue = DataValue;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.ConstraintGrade = (IfcConstraintEnum) parameters.get(2);
		this.ConstraintSource = (IfcLabel) parameters.get(3);
		this.CreatingActor = (IfcActorSelect) parameters.get(4);
		this.CreationTime = (IfcDateTimeSelect) parameters.get(5);
		this.UserDefinedGrade = (IfcLabel) parameters.get(6);
		this.Benchmark = (IfcBenchmarkEnum) parameters.get(7);
		this.ValueSource = (IfcLabel) parameters.get(8);
		this.DataValue = (IfcMetricValueSelect) parameters.get(9);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcMetric.nonInverseAttributes;	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	private java.util.HashSet<String> getRedefinedDerivedAttributeTypes()
	{
		java.util.HashSet<String> redefinedDerivedAttributes = new java.util.HashSet<String>();
		return redefinedDerivedAttributes;	}

	/**
 * This method returns the object IFC  STEP representation. This method is called by the IfcModel object to write IFC STEP files.
	 *
	 * @return the IFC STEP representation of this object
	**/
	public String getStepLine()
	{
		String stepString = new String("#"+this.stepLineNumber+"= ");
		stepString = stepString.concat("IFCMETRIC(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ConstraintGrade")) stepString = stepString.concat("*,");
		else{
		if(this.ConstraintGrade != null)		stepString = stepString.concat(((RootInterface)this.ConstraintGrade).getStepParameter(IfcConstraintEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ConstraintSource")) stepString = stepString.concat("*,");
		else{
		if(this.ConstraintSource != null)		stepString = stepString.concat(((RootInterface)this.ConstraintSource).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CreatingActor")) stepString = stepString.concat("*,");
		else{
		if(this.CreatingActor != null)		stepString = stepString.concat(((RootInterface)this.CreatingActor).getStepParameter(IfcActorSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CreationTime")) stepString = stepString.concat("*,");
		else{
		if(this.CreationTime != null)		stepString = stepString.concat(((RootInterface)this.CreationTime).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedGrade")) stepString = stepString.concat("*,");
		else{
		if(this.UserDefinedGrade != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedGrade).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Benchmark")) stepString = stepString.concat("*,");
		else{
		if(this.Benchmark != null)		stepString = stepString.concat(((RootInterface)this.Benchmark).getStepParameter(IfcBenchmarkEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ValueSource")) stepString = stepString.concat("*,");
		else{
		if(this.ValueSource != null)		stepString = stepString.concat(((RootInterface)this.ValueSource).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DataValue")) stepString = stepString.concat("*);");
		else{
		if(this.DataValue != null)		stepString = stepString.concat(((RootInterface)this.DataValue).getStepParameter(IfcMetricValueSelect.class.isInterface())+");");
		else		stepString = stepString.concat("$);");
		}
		return stepString;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		return "#" + this.stepLineNumber;
	}

	/**
	 * This method returns the line number within a IFC  STEP representation. This method is called from other objects, where this one is referenced.
	 *
	 * @return the STEP line number
	**/
	public int getStepLineNumber()
	{
		return this.stepLineNumber;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepLineNumber(int number)
	{
		this.stepLineNumber = number;
	}

	/**
	* This method sets the Benchmark attribute to the given value.
	*
	* @param Benchmark OPTIONAL value to set
	**/
	public void setBenchmark(IfcBenchmarkEnum Benchmark)
	{
		this.Benchmark = Benchmark;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Benchmark attribute.
	*
	* @return the value of Benchmark
	/**/
	public IfcBenchmarkEnum getBenchmark()
	{
		return this.Benchmark;
	}

	/**
	* This method sets the ValueSource attribute to the given value.
	*
	* @param ValueSource DEMANDED value to set - may not be null
	**/
	public void setValueSource(IfcLabel ValueSource)
	{
		this.ValueSource = ValueSource;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ValueSource attribute.
	*
	* @return the value of ValueSource
	/**/
	public IfcLabel getValueSource()
	{
		return this.ValueSource;
	}

	/**
	* This method sets the DataValue attribute to the given value.
	*
	* @param DataValue OPTIONAL value to set
	**/
	public void setDataValue(IfcMetricValueSelect DataValue)
	{
		this.DataValue = DataValue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DataValue attribute.
	*
	* @return the value of DataValue
	/**/
	public IfcMetricValueSelect getDataValue()
	{
		return this.DataValue;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepParameter(java.util.ArrayList<CloneableObject> parameter)
	{
		this.stepParameter = parameter;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	java.util.ArrayList<CloneableObject> getStepParameter()
	{
		return this.stepParameter;
	}

	/**
	 * This method registers an ObjectChangeListener to this object. An event is fired whenever one of its values was changed.
	 * 
	 *@param listener the listener to register
	**/
	public void addObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	listenerList = new java.util.HashSet<ObjectChangeListener>(1,1);
		listenerList.add(listener);
	}

	/**
	 * This method unregisters an ObjectChangeListener from this object.
	 * 
	 *@param listener the listener to unregister
	**/
	public void removeObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	return;
		listenerList.remove(listener);
		if (listenerList.size()==0) listenerList = null;
	}

	/**
	 * This method removes all currently registered ObjectChangeListeners from this object.
	**/
	public void removeAllObjectChangeListeners()
	{
		listenerList = null;
	}

	protected void fireChangeEvent()
	{
		if(listenerList == null) return;
		for(ObjectChangeListener listener : listenerList)
			listener.ifcModelObjectChange(this);
	}

	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{
		IfcMetric ifcMetric = new IfcMetric();
		if(this.Name != null)
			ifcMetric.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcMetric.setDescription((IfcText)this.Description.clone());
		if(this.ConstraintGrade != null)
			ifcMetric.setConstraintGrade((IfcConstraintEnum)this.ConstraintGrade.clone());
		if(this.ConstraintSource != null)
			ifcMetric.setConstraintSource((IfcLabel)this.ConstraintSource.clone());
		if(this.CreatingActor != null)
			ifcMetric.setCreatingActor((IfcActorSelect)this.CreatingActor.clone());
		if(this.CreationTime != null)
			ifcMetric.setCreationTime((IfcDateTimeSelect)this.CreationTime.clone());
		if(this.UserDefinedGrade != null)
			ifcMetric.setUserDefinedGrade((IfcLabel)this.UserDefinedGrade.clone());
		if(this.Benchmark != null)
			ifcMetric.setBenchmark((IfcBenchmarkEnum)this.Benchmark.clone());
		if(this.ValueSource != null)
			ifcMetric.setValueSource((IfcLabel)this.ValueSource.clone());
		if(this.DataValue != null)
			ifcMetric.setDataValue((IfcMetricValueSelect)this.DataValue.clone());
		return ifcMetric;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcMetric ifcMetric = new IfcMetric();
		if(this.Name != null)
			ifcMetric.setName(this.Name);
		if(this.Description != null)
			ifcMetric.setDescription(this.Description);
		if(this.ConstraintGrade != null)
			ifcMetric.setConstraintGrade(this.ConstraintGrade);
		if(this.ConstraintSource != null)
			ifcMetric.setConstraintSource(this.ConstraintSource);
		if(this.CreatingActor != null)
			ifcMetric.setCreatingActor(this.CreatingActor);
		if(this.CreationTime != null)
			ifcMetric.setCreationTime(this.CreationTime);
		if(this.UserDefinedGrade != null)
			ifcMetric.setUserDefinedGrade(this.UserDefinedGrade);
		if(this.Benchmark != null)
			ifcMetric.setBenchmark(this.Benchmark);
		if(this.ValueSource != null)
			ifcMetric.setValueSource(this.ValueSource);
		if(this.DataValue != null)
			ifcMetric.setDataValue(this.DataValue);
		return ifcMetric;
	}

	/**
	* This method returns the objects standard description.
	*
	* @return the standard description
	**/
	public String toString()
	{
		return "#"+ this.getStepLineNumber() + " " + this.getClass().getSimpleName();
	}


}