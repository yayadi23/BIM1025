/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcConstraintClassificationRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcConstraintClassificationRelationship extends InternalAccessClass implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcConstraint","SET<IfcClassificationNotationSelect>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ClassifiedConstraint is an DEMANDED attribute - may not be null**/
	protected IfcConstraint ClassifiedConstraint;
	/** RelatedClassifications is an DEMANDED attribute - may not be null**/
	protected SET<IfcClassificationNotationSelect> RelatedClassifications;
	/**
	* The default constructor.
	**/
	public IfcConstraintClassificationRelationship(){}

	private static final String[] attributes = new String[]{"ClassifiedConstraint","RelatedClassifications"};

	public String[] getAttributes() {
		return IfcConstraintClassificationRelationship.attributes;
	}

	/**
	* Constructs a new IfcConstraintClassificationRelationship object using the given parameters.
	*
	* @param ClassifiedConstraint DEMANDED parameter of type IfcConstraint - may not be null.
	* @param RelatedClassifications DEMANDED parameter of type SET<IfcClassificationNotationSelect> - may not be null.
	**/
	public IfcConstraintClassificationRelationship(IfcConstraint ClassifiedConstraint, SET<IfcClassificationNotationSelect> RelatedClassifications)
	{
		this.ClassifiedConstraint = ClassifiedConstraint;
		this.RelatedClassifications = RelatedClassifications;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcConstraintClassificationRelationship object using the given parameters.
	*
	* @param ClassifiedConstraint DEMANDED parameter of type IfcConstraint - may not be null.
	* @param RelatedClassifications DEMANDED parameter of type SET<IfcClassificationNotationSelect> - may not be null.
	**/
	public void setParameters(IfcConstraint ClassifiedConstraint, SET<IfcClassificationNotationSelect> RelatedClassifications)
	{
		this.ClassifiedConstraint = ClassifiedConstraint;
		this.RelatedClassifications = RelatedClassifications;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ClassifiedConstraint = (IfcConstraint) parameters.get(0);
		this.RelatedClassifications = (SET<IfcClassificationNotationSelect>) parameters.get(1);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		listenerList = null;
	}

	private void resolveInverses()
	{
		if(ClassifiedConstraint != null)
		{
				if(ClassifiedConstraint.ClassifiedAs_Inverse == null)
				{
					ClassifiedConstraint.ClassifiedAs_Inverse = new SET<IfcConstraintClassificationRelationship>();
				}
				ClassifiedConstraint.ClassifiedAs_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcConstraintClassificationRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCONSTRAINTCLASSIFICATIONRELATIONSHIP(");
		if(getRedefinedDerivedAttributeTypes().contains("ClassifiedConstraint")) stepString = stepString.concat("*,");
		else{
		if(this.ClassifiedConstraint != null)		stepString = stepString.concat(((RootInterface)this.ClassifiedConstraint).getStepParameter(IfcConstraint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedClassifications")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedClassifications != null)		stepString = stepString.concat(((RootInterface)this.RelatedClassifications).getStepParameter(IfcClassificationNotationSelect.class.isInterface())+");");
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
	* This method sets the ClassifiedConstraint attribute to the given value.
	*
	* @param ClassifiedConstraint OPTIONAL value to set
	**/
	public void setClassifiedConstraint(IfcConstraint ClassifiedConstraint)
	{
		synchronizeInversesRemoveClassifiedConstraint(this.ClassifiedConstraint);
		this.ClassifiedConstraint = ClassifiedConstraint;
		synchronizeInversesAddClassifiedConstraint(this.ClassifiedConstraint);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ClassifiedConstraint attribute.
	*
	* @return the value of ClassifiedConstraint
	/**/
	public IfcConstraint getClassifiedConstraint()
	{
		return this.ClassifiedConstraint;
	}

	private void synchronizeInversesAddClassifiedConstraint(IfcConstraint ClassifiedConstraint)
	{
		if(ClassifiedConstraint != null)
		{
				if(ClassifiedConstraint.ClassifiedAs_Inverse == null)
				{
					ClassifiedConstraint.ClassifiedAs_Inverse = new SET<IfcConstraintClassificationRelationship>();
				}
				ClassifiedConstraint.ClassifiedAs_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveClassifiedConstraint(IfcConstraint ClassifiedConstraint)
	{
		if(ClassifiedConstraint != null)
		{
				if(ClassifiedConstraint.ClassifiedAs_Inverse != null)
				{
					ClassifiedConstraint.ClassifiedAs_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedClassifications attribute to the given value.
	*
	* @param RelatedClassifications OPTIONAL value to set
	**/
	public void setRelatedClassifications(SET<IfcClassificationNotationSelect> RelatedClassifications)
	{
		this.RelatedClassifications = RelatedClassifications;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the RelatedClassifications attribute.
	*
	* @return a copy of the RelatedClassifications set
	**/
	public SET<IfcClassificationNotationSelect> getRelatedClassifications()
	{
		if(this.RelatedClassifications != null)
			return new SET<IfcClassificationNotationSelect>(this.RelatedClassifications);
		return null;
	}

	/**
	* This method adds an IfcClassificationNotationSelect object to the RelatedClassifications set.
	* @param RelatedClassifications element to be appended to this set.
	**/
	public void addRelatedClassifications(IfcClassificationNotationSelect RelatedClassifications)
	{
		if(this.RelatedClassifications == null)
			this.RelatedClassifications = new SET<IfcClassificationNotationSelect>();
		this.RelatedClassifications.add(RelatedClassifications);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcClassificationNotationSelect objects to the RelatedClassifications set.
	* @param RelatedClassifications collection containing elements to be added to this set.
	**/
	public void addAllRelatedClassifications(java.util.Collection<IfcClassificationNotationSelect> RelatedClassifications)
	{
		if(this.RelatedClassifications == null)
			this.RelatedClassifications = new SET<IfcClassificationNotationSelect>();
		this.RelatedClassifications.addAll(RelatedClassifications);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedClassifications set.
	**/
	public void clearRelatedClassifications()
	{
		if(this.RelatedClassifications != null)
		{
			this.RelatedClassifications.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcClassificationNotationSelect object from the RelatedClassifications set.
	* @param RelatedClassifications element to be removed from this set.
	**/
	public void removeRelatedClassifications(IfcClassificationNotationSelect RelatedClassifications)
	{
		if(this.RelatedClassifications != null)
		{
			this.RelatedClassifications.remove(RelatedClassifications);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcClassificationNotationSelect objects from the RelatedClassifications set.
	* @param RelatedClassifications collection containing elements to be removed from this set.
	**/
	public void removeAllRelatedClassifications(java.util.Collection<IfcClassificationNotationSelect> RelatedClassifications)
	{
		if(this.RelatedClassifications != null)
		{
			this.RelatedClassifications.removeAll(RelatedClassifications);
			fireChangeEvent();
		}
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
		IfcConstraintClassificationRelationship ifcConstraintClassificationRelationship = new IfcConstraintClassificationRelationship();
		if(this.ClassifiedConstraint != null)
			ifcConstraintClassificationRelationship.setClassifiedConstraint((IfcConstraint)this.ClassifiedConstraint.clone());
		if(this.RelatedClassifications != null)
			ifcConstraintClassificationRelationship.setRelatedClassifications((SET<IfcClassificationNotationSelect>)this.RelatedClassifications.clone());
		return ifcConstraintClassificationRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcConstraintClassificationRelationship ifcConstraintClassificationRelationship = new IfcConstraintClassificationRelationship();
		if(this.ClassifiedConstraint != null)
			ifcConstraintClassificationRelationship.setClassifiedConstraint(this.ClassifiedConstraint);
		if(this.RelatedClassifications != null)
			ifcConstraintClassificationRelationship.setRelatedClassifications(this.RelatedClassifications);
		return ifcConstraintClassificationRelationship;
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
