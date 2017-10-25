/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcWorkPlan<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcWorkPlan extends IfcWorkControl implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcIdentifier","IfcDateTimeSelect","SET<IfcPerson>","IfcLabel","IfcTimeMeasure","IfcTimeMeasure","IfcDateTimeSelect","IfcDateTimeSelect","IfcWorkControlTypeEnum","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/**
	* The default constructor.
	**/
	public IfcWorkPlan(){}
	private static final String[] attributes = new String[]{"GlobalId","OwnerHistory","Name","Description",
			"ObjectType","Identifier","CreationDate","Creators","Purpose","Duration","TotalFloat","StartTime","FinishTime","WorkControlType","UserDefinedControlType"};

	public String[] getAttributes(){
		return IfcWorkPlan.attributes;
	}


	/**
	* Constructs a new IfcWorkPlan object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param Identifier DEMANDED parameter of type IfcIdentifier - may not be null.
	* @param CreationDate DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	* @param Creators OPTIONAL parameter of type SET<IfcPerson>
	* @param Purpose OPTIONAL parameter of type IfcLabel
	* @param Duration OPTIONAL parameter of type IfcTimeMeasure
	* @param TotalFloat OPTIONAL parameter of type IfcTimeMeasure
	* @param StartTime DEMANDED parameter of type IfcDateTimeSelect - may not be null.
	* @param FinishTime OPTIONAL parameter of type IfcDateTimeSelect
	* @param WorkControlType OPTIONAL parameter of type IfcWorkControlTypeEnum
	* @param UserDefinedControlType OPTIONAL parameter of type IfcLabel
	**/
	public IfcWorkPlan(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcIdentifier Identifier, IfcDateTimeSelect CreationDate, SET<IfcPerson> Creators, IfcLabel Purpose, IfcTimeMeasure Duration, IfcTimeMeasure TotalFloat, IfcDateTimeSelect StartTime, IfcDateTimeSelect FinishTime, IfcWorkControlTypeEnum WorkControlType, IfcLabel UserDefinedControlType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.Identifier = Identifier;
		this.CreationDate = CreationDate;
		this.Creators = Creators;
		this.Purpose = Purpose;
		this.Duration = Duration;
		this.TotalFloat = TotalFloat;
		this.StartTime = StartTime;
		this.FinishTime = FinishTime;
		this.WorkControlType = WorkControlType;
		this.UserDefinedControlType = UserDefinedControlType;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.Identifier = (IfcIdentifier) parameters.get(5);
		this.CreationDate = (IfcDateTimeSelect) parameters.get(6);
		this.Creators = (SET<IfcPerson>) parameters.get(7);
		this.Purpose = (IfcLabel) parameters.get(8);
		this.Duration = (IfcTimeMeasure) parameters.get(9);
		this.TotalFloat = (IfcTimeMeasure) parameters.get(10);
		this.StartTime = (IfcDateTimeSelect) parameters.get(11);
		this.FinishTime = (IfcDateTimeSelect) parameters.get(12);
		this.WorkControlType = (IfcWorkControlTypeEnum) parameters.get(13);
		this.UserDefinedControlType = (IfcLabel) parameters.get(14);
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
		return IfcWorkPlan.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCWORKPLAN(");
		if(getRedefinedDerivedAttributeTypes().contains("GlobalId")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalId != null)		stepString = stepString.concat(((RootInterface)this.GlobalId).getStepParameter(IfcGloballyUniqueId.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OwnerHistory")) stepString = stepString.concat("*,");
		else{
		if(this.OwnerHistory != null)		stepString = stepString.concat(((RootInterface)this.OwnerHistory).getStepParameter(IfcOwnerHistory.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
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
		if(getRedefinedDerivedAttributeTypes().contains("ObjectType")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectType != null)		stepString = stepString.concat(((RootInterface)this.ObjectType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Identifier")) stepString = stepString.concat("*,");
		else{
		if(this.Identifier != null)		stepString = stepString.concat(((RootInterface)this.Identifier).getStepParameter(IfcIdentifier.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CreationDate")) stepString = stepString.concat("*,");
		else{
		if(this.CreationDate != null)		stepString = stepString.concat(((RootInterface)this.CreationDate).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Creators")) stepString = stepString.concat("*,");
		else{
		if(this.Creators != null)		stepString = stepString.concat(((RootInterface)this.Creators).getStepParameter(IfcPerson.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Purpose")) stepString = stepString.concat("*,");
		else{
		if(this.Purpose != null)		stepString = stepString.concat(((RootInterface)this.Purpose).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Duration")) stepString = stepString.concat("*,");
		else{
		if(this.Duration != null)		stepString = stepString.concat(((RootInterface)this.Duration).getStepParameter(IfcTimeMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TotalFloat")) stepString = stepString.concat("*,");
		else{
		if(this.TotalFloat != null)		stepString = stepString.concat(((RootInterface)this.TotalFloat).getStepParameter(IfcTimeMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("StartTime")) stepString = stepString.concat("*,");
		else{
		if(this.StartTime != null)		stepString = stepString.concat(((RootInterface)this.StartTime).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FinishTime")) stepString = stepString.concat("*,");
		else{
		if(this.FinishTime != null)		stepString = stepString.concat(((RootInterface)this.FinishTime).getStepParameter(IfcDateTimeSelect.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WorkControlType")) stepString = stepString.concat("*,");
		else{
		if(this.WorkControlType != null)		stepString = stepString.concat(((RootInterface)this.WorkControlType).getStepParameter(IfcWorkControlTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("UserDefinedControlType")) stepString = stepString.concat("*);");
		else{
		if(this.UserDefinedControlType != null)		stepString = stepString.concat(((RootInterface)this.UserDefinedControlType).getStepParameter(IfcLabel.class.isInterface())+");");
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
	@SuppressWarnings("unchecked")
	public Object clone()
	{
		IfcWorkPlan ifcWorkPlan = new IfcWorkPlan();
		if(this.GlobalId != null)
			ifcWorkPlan.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcWorkPlan.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcWorkPlan.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcWorkPlan.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcWorkPlan.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.Identifier != null)
			ifcWorkPlan.setIdentifier((IfcIdentifier)this.Identifier.clone());
		if(this.CreationDate != null)
			ifcWorkPlan.setCreationDate((IfcDateTimeSelect)this.CreationDate.clone());
		if(this.Creators != null)
			ifcWorkPlan.setCreators((SET<IfcPerson>)this.Creators.clone());
		if(this.Purpose != null)
			ifcWorkPlan.setPurpose((IfcLabel)this.Purpose.clone());
		if(this.Duration != null)
			ifcWorkPlan.setDuration((IfcTimeMeasure)this.Duration.clone());
		if(this.TotalFloat != null)
			ifcWorkPlan.setTotalFloat((IfcTimeMeasure)this.TotalFloat.clone());
		if(this.StartTime != null)
			ifcWorkPlan.setStartTime((IfcDateTimeSelect)this.StartTime.clone());
		if(this.FinishTime != null)
			ifcWorkPlan.setFinishTime((IfcDateTimeSelect)this.FinishTime.clone());
		if(this.WorkControlType != null)
			ifcWorkPlan.setWorkControlType((IfcWorkControlTypeEnum)this.WorkControlType.clone());
		if(this.UserDefinedControlType != null)
			ifcWorkPlan.setUserDefinedControlType((IfcLabel)this.UserDefinedControlType.clone());
		return ifcWorkPlan;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcWorkPlan ifcWorkPlan = new IfcWorkPlan();
		if(this.GlobalId != null)
			ifcWorkPlan.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcWorkPlan.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcWorkPlan.setName(this.Name);
		if(this.Description != null)
			ifcWorkPlan.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcWorkPlan.setObjectType(this.ObjectType);
		if(this.Identifier != null)
			ifcWorkPlan.setIdentifier(this.Identifier);
		if(this.CreationDate != null)
			ifcWorkPlan.setCreationDate(this.CreationDate);
		if(this.Creators != null)
			ifcWorkPlan.setCreators(this.Creators);
		if(this.Purpose != null)
			ifcWorkPlan.setPurpose(this.Purpose);
		if(this.Duration != null)
			ifcWorkPlan.setDuration(this.Duration);
		if(this.TotalFloat != null)
			ifcWorkPlan.setTotalFloat(this.TotalFloat);
		if(this.StartTime != null)
			ifcWorkPlan.setStartTime(this.StartTime);
		if(this.FinishTime != null)
			ifcWorkPlan.setFinishTime(this.FinishTime);
		if(this.WorkControlType != null)
			ifcWorkPlan.setWorkControlType(this.WorkControlType);
		if(this.UserDefinedControlType != null)
			ifcWorkPlan.setUserDefinedControlType(this.UserDefinedControlType);
		return ifcWorkPlan;
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
