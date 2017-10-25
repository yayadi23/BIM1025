/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRibPlateProfileProperties<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRibPlateProfileProperties extends IfcProfileProperties implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcProfileDef","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcRibPlateDirectionEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Thickness is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure Thickness;
	/** RibHeight is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure RibHeight;
	/** RibWidth is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure RibWidth;
	/** RibSpacing is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure RibSpacing;
	/** Direction is an DEMANDED attribute - may not be null**/
	protected IfcRibPlateDirectionEnum Direction;
	/**
	* The default constructor.
	**/
	public IfcRibPlateProfileProperties(){}

	private static final String[] attributes = new String[]{"ProfileName","ProfileDefinition","Thickness","RibHeight"
	,"RibWidth","RibSpacing","Direction"};

	public String[] getAttributes() {
		return IfcRibPlateProfileProperties.attributes;
	}

	/**
	* Constructs a new IfcRibPlateProfileProperties object using the given parameters.
	*
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param ProfileDefinition OPTIONAL parameter of type IfcProfileDef
	* @param Thickness OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param RibHeight OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param RibWidth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param RibSpacing OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param Direction DEMANDED parameter of type IfcRibPlateDirectionEnum - may not be null.
	**/
	public IfcRibPlateProfileProperties(IfcLabel ProfileName, IfcProfileDef ProfileDefinition, IfcPositiveLengthMeasure Thickness, IfcPositiveLengthMeasure RibHeight, IfcPositiveLengthMeasure RibWidth, IfcPositiveLengthMeasure RibSpacing, IfcRibPlateDirectionEnum Direction)
	{
		this.ProfileName = ProfileName;
		this.ProfileDefinition = ProfileDefinition;
		this.Thickness = Thickness;
		this.RibHeight = RibHeight;
		this.RibWidth = RibWidth;
		this.RibSpacing = RibSpacing;
		this.Direction = Direction;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRibPlateProfileProperties object using the given parameters.
	*
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param ProfileDefinition OPTIONAL parameter of type IfcProfileDef
	* @param Thickness OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param RibHeight OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param RibWidth OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param RibSpacing OPTIONAL parameter of type IfcPositiveLengthMeasure
	* @param Direction DEMANDED parameter of type IfcRibPlateDirectionEnum - may not be null.
	**/
	public void setParameters(IfcLabel ProfileName, IfcProfileDef ProfileDefinition, IfcPositiveLengthMeasure Thickness, IfcPositiveLengthMeasure RibHeight, IfcPositiveLengthMeasure RibWidth, IfcPositiveLengthMeasure RibSpacing, IfcRibPlateDirectionEnum Direction)
	{
		this.ProfileName = ProfileName;
		this.ProfileDefinition = ProfileDefinition;
		this.Thickness = Thickness;
		this.RibHeight = RibHeight;
		this.RibWidth = RibWidth;
		this.RibSpacing = RibSpacing;
		this.Direction = Direction;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ProfileName = (IfcLabel) parameters.get(0);
		this.ProfileDefinition = (IfcProfileDef) parameters.get(1);
		this.Thickness = (IfcPositiveLengthMeasure) parameters.get(2);
		this.RibHeight = (IfcPositiveLengthMeasure) parameters.get(3);
		this.RibWidth = (IfcPositiveLengthMeasure) parameters.get(4);
		this.RibSpacing = (IfcPositiveLengthMeasure) parameters.get(5);
		this.Direction = (IfcRibPlateDirectionEnum) parameters.get(6);
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
		return IfcRibPlateProfileProperties.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRIBPLATEPROFILEPROPERTIES(");
		if(getRedefinedDerivedAttributeTypes().contains("ProfileName")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileName != null)		stepString = stepString.concat(((RootInterface)this.ProfileName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProfileDefinition")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileDefinition != null)		stepString = stepString.concat(((RootInterface)this.ProfileDefinition).getStepParameter(IfcProfileDef.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Thickness")) stepString = stepString.concat("*,");
		else{
		if(this.Thickness != null)		stepString = stepString.concat(((RootInterface)this.Thickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RibHeight")) stepString = stepString.concat("*,");
		else{
		if(this.RibHeight != null)		stepString = stepString.concat(((RootInterface)this.RibHeight).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RibWidth")) stepString = stepString.concat("*,");
		else{
		if(this.RibWidth != null)		stepString = stepString.concat(((RootInterface)this.RibWidth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RibSpacing")) stepString = stepString.concat("*,");
		else{
		if(this.RibSpacing != null)		stepString = stepString.concat(((RootInterface)this.RibSpacing).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Direction")) stepString = stepString.concat("*);");
		else{
		if(this.Direction != null)		stepString = stepString.concat(((RootInterface)this.Direction).getStepParameter(IfcRibPlateDirectionEnum.class.isInterface())+");");
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
	* This method sets the Thickness attribute to the given value.
	*
	* @param Thickness DEMANDED value to set - may not be null
	**/
	public void setThickness(IfcPositiveLengthMeasure Thickness)
	{
		this.Thickness = Thickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Thickness attribute.
	*
	* @return the value of Thickness
	/**/
	public IfcPositiveLengthMeasure getThickness()
	{
		return this.Thickness;
	}

	/**
	* This method sets the RibHeight attribute to the given value.
	*
	* @param RibHeight DEMANDED value to set - may not be null
	**/
	public void setRibHeight(IfcPositiveLengthMeasure RibHeight)
	{
		this.RibHeight = RibHeight;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RibHeight attribute.
	*
	* @return the value of RibHeight
	/**/
	public IfcPositiveLengthMeasure getRibHeight()
	{
		return this.RibHeight;
	}

	/**
	* This method sets the RibWidth attribute to the given value.
	*
	* @param RibWidth DEMANDED value to set - may not be null
	**/
	public void setRibWidth(IfcPositiveLengthMeasure RibWidth)
	{
		this.RibWidth = RibWidth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RibWidth attribute.
	*
	* @return the value of RibWidth
	/**/
	public IfcPositiveLengthMeasure getRibWidth()
	{
		return this.RibWidth;
	}

	/**
	* This method sets the RibSpacing attribute to the given value.
	*
	* @param RibSpacing DEMANDED value to set - may not be null
	**/
	public void setRibSpacing(IfcPositiveLengthMeasure RibSpacing)
	{
		this.RibSpacing = RibSpacing;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RibSpacing attribute.
	*
	* @return the value of RibSpacing
	/**/
	public IfcPositiveLengthMeasure getRibSpacing()
	{
		return this.RibSpacing;
	}

	/**
	* This method sets the Direction attribute to the given value.
	*
	* @param Direction OPTIONAL value to set
	**/
	public void setDirection(IfcRibPlateDirectionEnum Direction)
	{
		this.Direction = Direction;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Direction attribute.
	*
	* @return the value of Direction
	/**/
	public IfcRibPlateDirectionEnum getDirection()
	{
		return this.Direction;
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
		IfcRibPlateProfileProperties ifcRibPlateProfileProperties = new IfcRibPlateProfileProperties();
		if(this.ProfileName != null)
			ifcRibPlateProfileProperties.setProfileName((IfcLabel)this.ProfileName.clone());
		if(this.ProfileDefinition != null)
			ifcRibPlateProfileProperties.setProfileDefinition((IfcProfileDef)this.ProfileDefinition.clone());
		if(this.Thickness != null)
			ifcRibPlateProfileProperties.setThickness((IfcPositiveLengthMeasure)this.Thickness.clone());
		if(this.RibHeight != null)
			ifcRibPlateProfileProperties.setRibHeight((IfcPositiveLengthMeasure)this.RibHeight.clone());
		if(this.RibWidth != null)
			ifcRibPlateProfileProperties.setRibWidth((IfcPositiveLengthMeasure)this.RibWidth.clone());
		if(this.RibSpacing != null)
			ifcRibPlateProfileProperties.setRibSpacing((IfcPositiveLengthMeasure)this.RibSpacing.clone());
		if(this.Direction != null)
			ifcRibPlateProfileProperties.setDirection((IfcRibPlateDirectionEnum)this.Direction.clone());
		return ifcRibPlateProfileProperties;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRibPlateProfileProperties ifcRibPlateProfileProperties = new IfcRibPlateProfileProperties();
		if(this.ProfileName != null)
			ifcRibPlateProfileProperties.setProfileName(this.ProfileName);
		if(this.ProfileDefinition != null)
			ifcRibPlateProfileProperties.setProfileDefinition(this.ProfileDefinition);
		if(this.Thickness != null)
			ifcRibPlateProfileProperties.setThickness(this.Thickness);
		if(this.RibHeight != null)
			ifcRibPlateProfileProperties.setRibHeight(this.RibHeight);
		if(this.RibWidth != null)
			ifcRibPlateProfileProperties.setRibWidth(this.RibWidth);
		if(this.RibSpacing != null)
			ifcRibPlateProfileProperties.setRibSpacing(this.RibSpacing);
		if(this.Direction != null)
			ifcRibPlateProfileProperties.setDirection(this.Direction);
		return ifcRibPlateProfileProperties;
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