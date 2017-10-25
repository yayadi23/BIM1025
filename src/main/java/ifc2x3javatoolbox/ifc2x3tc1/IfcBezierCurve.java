/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcBezierCurve<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcBezierCurve extends IfcBSplineCurve implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"INTEGER","LIST<IfcCartesianPoint>","IfcBSplineCurveForm","LOGICAL","LOGICAL"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/**
	* The default constructor.
	**/
	public IfcBezierCurve(){}

	private static final String[] attributes = new String[]{"Degree","ControlPointsList","CurveForm","ClosedCurve"
			,"SelfIntersect"};

	public String[] getAttributes() {
		return IfcBezierCurve.attributes;
	}

	/**
	* Constructs a new IfcBezierCurve object using the given parameters.
	*
	* @param Degree DEMANDED parameter of type INTEGER - may not be null.
	* @param ControlPointsList DEMANDED parameter of type LIST<IfcCartesianPoint> - may not be null.
	* @param CurveForm DEMANDED parameter of type IfcBSplineCurveForm - may not be null.
	* @param ClosedCurve DEMANDED parameter of type LOGICAL - may not be null.
	* @param SelfIntersect DEMANDED parameter of type LOGICAL - may not be null.
	**/
	public IfcBezierCurve(INTEGER Degree, LIST<IfcCartesianPoint> ControlPointsList, IfcBSplineCurveForm CurveForm, LOGICAL ClosedCurve, LOGICAL SelfIntersect)
	{
		this.Degree = Degree;
		this.ControlPointsList = ControlPointsList;
		this.CurveForm = CurveForm;
		this.ClosedCurve = ClosedCurve;
		this.SelfIntersect = SelfIntersect;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Degree = (INTEGER) parameters.get(0);
		this.ControlPointsList = (LIST<IfcCartesianPoint>) parameters.get(1);
		this.CurveForm = (IfcBSplineCurveForm) parameters.get(2);
		this.ClosedCurve = (LOGICAL) parameters.get(3);
		this.SelfIntersect = (LOGICAL) parameters.get(4);
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
		return IfcBezierCurve.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCBEZIERCURVE(");
		if(getRedefinedDerivedAttributeTypes().contains("Degree")) stepString = stepString.concat("*,");
		else{
		if(this.Degree != null)		stepString = stepString.concat(((RootInterface)this.Degree).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ControlPointsList")) stepString = stepString.concat("*,");
		else{
		if(this.ControlPointsList != null)		stepString = stepString.concat(((RootInterface)this.ControlPointsList).getStepParameter(IfcCartesianPoint.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CurveForm")) stepString = stepString.concat("*,");
		else{
		if(this.CurveForm != null)		stepString = stepString.concat(((RootInterface)this.CurveForm).getStepParameter(IfcBSplineCurveForm.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ClosedCurve")) stepString = stepString.concat("*,");
		else{
		if(this.ClosedCurve != null)		stepString = stepString.concat(((RootInterface)this.ClosedCurve).getStepParameter(LOGICAL.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("SelfIntersect")) stepString = stepString.concat("*);");
		else{
		if(this.SelfIntersect != null)		stepString = stepString.concat(((RootInterface)this.SelfIntersect).getStepParameter(LOGICAL.class.isInterface())+");");
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
		IfcBezierCurve ifcBezierCurve = new IfcBezierCurve();
		if(this.Degree != null)
			ifcBezierCurve.setDegree((INTEGER)this.Degree.clone());
		if(this.ControlPointsList != null)
			ifcBezierCurve.setControlPointsList((LIST<IfcCartesianPoint>)this.ControlPointsList.clone());
		if(this.CurveForm != null)
			ifcBezierCurve.setCurveForm((IfcBSplineCurveForm)this.CurveForm.clone());
		if(this.ClosedCurve != null)
			ifcBezierCurve.setClosedCurve((LOGICAL)this.ClosedCurve.clone());
		if(this.SelfIntersect != null)
			ifcBezierCurve.setSelfIntersect((LOGICAL)this.SelfIntersect.clone());
		return ifcBezierCurve;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcBezierCurve ifcBezierCurve = new IfcBezierCurve();
		if(this.Degree != null)
			ifcBezierCurve.setDegree(this.Degree);
		if(this.ControlPointsList != null)
			ifcBezierCurve.setControlPointsList(this.ControlPointsList);
		if(this.CurveForm != null)
			ifcBezierCurve.setCurveForm(this.CurveForm);
		if(this.ClosedCurve != null)
			ifcBezierCurve.setClosedCurve(this.ClosedCurve);
		if(this.SelfIntersect != null)
			ifcBezierCurve.setSelfIntersect(this.SelfIntersect);
		return ifcBezierCurve;
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