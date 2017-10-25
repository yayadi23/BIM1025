/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcBoundaryEdgeCondition<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcBoundaryEdgeCondition extends IfcBoundaryCondition implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcModulusOfLinearSubgradeReactionMeasure","IfcModulusOfLinearSubgradeReactionMeasure","IfcModulusOfLinearSubgradeReactionMeasure","IfcModulusOfRotationalSubgradeReactionMeasure","IfcModulusOfRotationalSubgradeReactionMeasure","IfcModulusOfRotationalSubgradeReactionMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** LinearStiffnessByLengthX is an OPTIONAL attribute**/
	protected IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthX;
	/** LinearStiffnessByLengthY is an OPTIONAL attribute**/
	protected IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthY;
	/** LinearStiffnessByLengthZ is an OPTIONAL attribute**/
	protected IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthZ;
	/** RotationalStiffnessByLengthX is an OPTIONAL attribute**/
	protected IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthX;
	/** RotationalStiffnessByLengthY is an OPTIONAL attribute**/
	protected IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthY;
	/** RotationalStiffnessByLengthZ is an OPTIONAL attribute**/
	protected IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthZ;
	/**
	* The default constructor.
	**/
	public IfcBoundaryEdgeCondition(){}

	private static final String[] attributes = new String[]{"Name","LinearStiffnessByLengthX"
	,"LinearStiffnessByLengthY","LinearStiffnessByLengthZ","RotationalStiffnessByLengthX"
	,"RotationalStiffnessByLengthY","RotationalStiffnessByLengthZ"};

	public String[] getAttributes() {
		return IfcBoundaryEdgeCondition.attributes;
	}

	/**
	* Constructs a new IfcBoundaryEdgeCondition object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param LinearStiffnessByLengthX OPTIONAL parameter of type IfcModulusOfLinearSubgradeReactionMeasure
	* @param LinearStiffnessByLengthY OPTIONAL parameter of type IfcModulusOfLinearSubgradeReactionMeasure
	* @param LinearStiffnessByLengthZ OPTIONAL parameter of type IfcModulusOfLinearSubgradeReactionMeasure
	* @param RotationalStiffnessByLengthX OPTIONAL parameter of type IfcModulusOfRotationalSubgradeReactionMeasure
	* @param RotationalStiffnessByLengthY OPTIONAL parameter of type IfcModulusOfRotationalSubgradeReactionMeasure
	* @param RotationalStiffnessByLengthZ OPTIONAL parameter of type IfcModulusOfRotationalSubgradeReactionMeasure
	**/
	public IfcBoundaryEdgeCondition(IfcLabel Name, IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthX, IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthY, IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthZ, IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthX, IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthY, IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthZ)
	{
		this.Name = Name;
		this.LinearStiffnessByLengthX = LinearStiffnessByLengthX;
		this.LinearStiffnessByLengthY = LinearStiffnessByLengthY;
		this.LinearStiffnessByLengthZ = LinearStiffnessByLengthZ;
		this.RotationalStiffnessByLengthX = RotationalStiffnessByLengthX;
		this.RotationalStiffnessByLengthY = RotationalStiffnessByLengthY;
		this.RotationalStiffnessByLengthZ = RotationalStiffnessByLengthZ;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcBoundaryEdgeCondition object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param LinearStiffnessByLengthX OPTIONAL parameter of type IfcModulusOfLinearSubgradeReactionMeasure
	* @param LinearStiffnessByLengthY OPTIONAL parameter of type IfcModulusOfLinearSubgradeReactionMeasure
	* @param LinearStiffnessByLengthZ OPTIONAL parameter of type IfcModulusOfLinearSubgradeReactionMeasure
	* @param RotationalStiffnessByLengthX OPTIONAL parameter of type IfcModulusOfRotationalSubgradeReactionMeasure
	* @param RotationalStiffnessByLengthY OPTIONAL parameter of type IfcModulusOfRotationalSubgradeReactionMeasure
	* @param RotationalStiffnessByLengthZ OPTIONAL parameter of type IfcModulusOfRotationalSubgradeReactionMeasure
	**/
	public void setParameters(IfcLabel Name, IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthX, IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthY, IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthZ, IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthX, IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthY, IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthZ)
	{
		this.Name = Name;
		this.LinearStiffnessByLengthX = LinearStiffnessByLengthX;
		this.LinearStiffnessByLengthY = LinearStiffnessByLengthY;
		this.LinearStiffnessByLengthZ = LinearStiffnessByLengthZ;
		this.RotationalStiffnessByLengthX = RotationalStiffnessByLengthX;
		this.RotationalStiffnessByLengthY = RotationalStiffnessByLengthY;
		this.RotationalStiffnessByLengthZ = RotationalStiffnessByLengthZ;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.LinearStiffnessByLengthX = (IfcModulusOfLinearSubgradeReactionMeasure) parameters.get(1);
		this.LinearStiffnessByLengthY = (IfcModulusOfLinearSubgradeReactionMeasure) parameters.get(2);
		this.LinearStiffnessByLengthZ = (IfcModulusOfLinearSubgradeReactionMeasure) parameters.get(3);
		this.RotationalStiffnessByLengthX = (IfcModulusOfRotationalSubgradeReactionMeasure) parameters.get(4);
		this.RotationalStiffnessByLengthY = (IfcModulusOfRotationalSubgradeReactionMeasure) parameters.get(5);
		this.RotationalStiffnessByLengthZ = (IfcModulusOfRotationalSubgradeReactionMeasure) parameters.get(6);
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
		return IfcBoundaryEdgeCondition.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCBOUNDARYEDGECONDITION(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearStiffnessByLengthX")) stepString = stepString.concat("*,");
		else{
		if(this.LinearStiffnessByLengthX != null)		stepString = stepString.concat(((RootInterface)this.LinearStiffnessByLengthX).getStepParameter(IfcModulusOfLinearSubgradeReactionMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearStiffnessByLengthY")) stepString = stepString.concat("*,");
		else{
		if(this.LinearStiffnessByLengthY != null)		stepString = stepString.concat(((RootInterface)this.LinearStiffnessByLengthY).getStepParameter(IfcModulusOfLinearSubgradeReactionMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("LinearStiffnessByLengthZ")) stepString = stepString.concat("*,");
		else{
		if(this.LinearStiffnessByLengthZ != null)		stepString = stepString.concat(((RootInterface)this.LinearStiffnessByLengthZ).getStepParameter(IfcModulusOfLinearSubgradeReactionMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RotationalStiffnessByLengthX")) stepString = stepString.concat("*,");
		else{
		if(this.RotationalStiffnessByLengthX != null)		stepString = stepString.concat(((RootInterface)this.RotationalStiffnessByLengthX).getStepParameter(IfcModulusOfRotationalSubgradeReactionMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RotationalStiffnessByLengthY")) stepString = stepString.concat("*,");
		else{
		if(this.RotationalStiffnessByLengthY != null)		stepString = stepString.concat(((RootInterface)this.RotationalStiffnessByLengthY).getStepParameter(IfcModulusOfRotationalSubgradeReactionMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RotationalStiffnessByLengthZ")) stepString = stepString.concat("*);");
		else{
		if(this.RotationalStiffnessByLengthZ != null)		stepString = stepString.concat(((RootInterface)this.RotationalStiffnessByLengthZ).getStepParameter(IfcModulusOfRotationalSubgradeReactionMeasure.class.isInterface())+");");
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
	* This method sets the LinearStiffnessByLengthX attribute to the given value.
	*
	* @param LinearStiffnessByLengthX DEMANDED value to set - may not be null
	**/
	public void setLinearStiffnessByLengthX(IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthX)
	{
		this.LinearStiffnessByLengthX = LinearStiffnessByLengthX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearStiffnessByLengthX attribute.
	*
	* @return the value of LinearStiffnessByLengthX
	/**/
	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthX()
	{
		return this.LinearStiffnessByLengthX;
	}

	/**
	* This method sets the LinearStiffnessByLengthY attribute to the given value.
	*
	* @param LinearStiffnessByLengthY DEMANDED value to set - may not be null
	**/
	public void setLinearStiffnessByLengthY(IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthY)
	{
		this.LinearStiffnessByLengthY = LinearStiffnessByLengthY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearStiffnessByLengthY attribute.
	*
	* @return the value of LinearStiffnessByLengthY
	/**/
	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthY()
	{
		return this.LinearStiffnessByLengthY;
	}

	/**
	* This method sets the LinearStiffnessByLengthZ attribute to the given value.
	*
	* @param LinearStiffnessByLengthZ DEMANDED value to set - may not be null
	**/
	public void setLinearStiffnessByLengthZ(IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthZ)
	{
		this.LinearStiffnessByLengthZ = LinearStiffnessByLengthZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the LinearStiffnessByLengthZ attribute.
	*
	* @return the value of LinearStiffnessByLengthZ
	/**/
	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthZ()
	{
		return this.LinearStiffnessByLengthZ;
	}

	/**
	* This method sets the RotationalStiffnessByLengthX attribute to the given value.
	*
	* @param RotationalStiffnessByLengthX DEMANDED value to set - may not be null
	**/
	public void setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthX)
	{
		this.RotationalStiffnessByLengthX = RotationalStiffnessByLengthX;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RotationalStiffnessByLengthX attribute.
	*
	* @return the value of RotationalStiffnessByLengthX
	/**/
	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthX()
	{
		return this.RotationalStiffnessByLengthX;
	}

	/**
	* This method sets the RotationalStiffnessByLengthY attribute to the given value.
	*
	* @param RotationalStiffnessByLengthY DEMANDED value to set - may not be null
	**/
	public void setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthY)
	{
		this.RotationalStiffnessByLengthY = RotationalStiffnessByLengthY;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RotationalStiffnessByLengthY attribute.
	*
	* @return the value of RotationalStiffnessByLengthY
	/**/
	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthY()
	{
		return this.RotationalStiffnessByLengthY;
	}

	/**
	* This method sets the RotationalStiffnessByLengthZ attribute to the given value.
	*
	* @param RotationalStiffnessByLengthZ DEMANDED value to set - may not be null
	**/
	public void setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthZ)
	{
		this.RotationalStiffnessByLengthZ = RotationalStiffnessByLengthZ;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RotationalStiffnessByLengthZ attribute.
	*
	* @return the value of RotationalStiffnessByLengthZ
	/**/
	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthZ()
	{
		return this.RotationalStiffnessByLengthZ;
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
		IfcBoundaryEdgeCondition ifcBoundaryEdgeCondition = new IfcBoundaryEdgeCondition();
		if(this.Name != null)
			ifcBoundaryEdgeCondition.setName((IfcLabel)this.Name.clone());
		if(this.LinearStiffnessByLengthX != null)
			ifcBoundaryEdgeCondition.setLinearStiffnessByLengthX((IfcModulusOfLinearSubgradeReactionMeasure)this.LinearStiffnessByLengthX.clone());
		if(this.LinearStiffnessByLengthY != null)
			ifcBoundaryEdgeCondition.setLinearStiffnessByLengthY((IfcModulusOfLinearSubgradeReactionMeasure)this.LinearStiffnessByLengthY.clone());
		if(this.LinearStiffnessByLengthZ != null)
			ifcBoundaryEdgeCondition.setLinearStiffnessByLengthZ((IfcModulusOfLinearSubgradeReactionMeasure)this.LinearStiffnessByLengthZ.clone());
		if(this.RotationalStiffnessByLengthX != null)
			ifcBoundaryEdgeCondition.setRotationalStiffnessByLengthX((IfcModulusOfRotationalSubgradeReactionMeasure)this.RotationalStiffnessByLengthX.clone());
		if(this.RotationalStiffnessByLengthY != null)
			ifcBoundaryEdgeCondition.setRotationalStiffnessByLengthY((IfcModulusOfRotationalSubgradeReactionMeasure)this.RotationalStiffnessByLengthY.clone());
		if(this.RotationalStiffnessByLengthZ != null)
			ifcBoundaryEdgeCondition.setRotationalStiffnessByLengthZ((IfcModulusOfRotationalSubgradeReactionMeasure)this.RotationalStiffnessByLengthZ.clone());
		return ifcBoundaryEdgeCondition;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcBoundaryEdgeCondition ifcBoundaryEdgeCondition = new IfcBoundaryEdgeCondition();
		if(this.Name != null)
			ifcBoundaryEdgeCondition.setName(this.Name);
		if(this.LinearStiffnessByLengthX != null)
			ifcBoundaryEdgeCondition.setLinearStiffnessByLengthX(this.LinearStiffnessByLengthX);
		if(this.LinearStiffnessByLengthY != null)
			ifcBoundaryEdgeCondition.setLinearStiffnessByLengthY(this.LinearStiffnessByLengthY);
		if(this.LinearStiffnessByLengthZ != null)
			ifcBoundaryEdgeCondition.setLinearStiffnessByLengthZ(this.LinearStiffnessByLengthZ);
		if(this.RotationalStiffnessByLengthX != null)
			ifcBoundaryEdgeCondition.setRotationalStiffnessByLengthX(this.RotationalStiffnessByLengthX);
		if(this.RotationalStiffnessByLengthY != null)
			ifcBoundaryEdgeCondition.setRotationalStiffnessByLengthY(this.RotationalStiffnessByLengthY);
		if(this.RotationalStiffnessByLengthZ != null)
			ifcBoundaryEdgeCondition.setRotationalStiffnessByLengthZ(this.RotationalStiffnessByLengthZ);
		return ifcBoundaryEdgeCondition;
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
