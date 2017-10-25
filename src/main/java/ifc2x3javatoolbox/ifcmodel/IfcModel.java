package ifc2x3javatoolbox.ifcmodel;
import ifc2x3javatoolbox.guidcompressor.GuidCompressor;
import ifc2x3javatoolbox.ifc2x3tc1.ClassInterface;
import ifc2x3javatoolbox.ifc2x3tc1.DOUBLE;
import ifc2x3javatoolbox.ifc2x3tc1.File_Description;
import ifc2x3javatoolbox.ifc2x3tc1.File_Name;
import ifc2x3javatoolbox.ifc2x3tc1.File_Schema;
import ifc2x3javatoolbox.ifc2x3tc1.IfcApplication;
import ifc2x3javatoolbox.ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3javatoolbox.ifc2x3tc1.IfcBuilding;
import ifc2x3javatoolbox.ifc2x3tc1.IfcBuildingStorey;
import ifc2x3javatoolbox.ifc2x3tc1.IfcCartesianPoint;
import ifc2x3javatoolbox.ifc2x3tc1.IfcChangeActionEnum;
import ifc2x3javatoolbox.ifc2x3tc1.IfcChangeActionEnum.IfcChangeActionEnum_internal;
import ifc2x3javatoolbox.ifc2x3tc1.IfcDimensionCount;
import ifc2x3javatoolbox.ifc2x3tc1.IfcElementCompositionEnum;
import ifc2x3javatoolbox.ifc2x3tc1.IfcGeometricRepresentationContext;
import ifc2x3javatoolbox.ifc2x3tc1.IfcGloballyUniqueId;
import ifc2x3javatoolbox.ifc2x3tc1.IfcIdentifier;
import ifc2x3javatoolbox.ifc2x3tc1.IfcLabel;
import ifc2x3javatoolbox.ifc2x3tc1.IfcLengthMeasure;
import ifc2x3javatoolbox.ifc2x3tc1.IfcLocalPlacement;
import ifc2x3javatoolbox.ifc2x3tc1.IfcObjectDefinition;
import ifc2x3javatoolbox.ifc2x3tc1.IfcOrganization;
import ifc2x3javatoolbox.ifc2x3tc1.IfcOwnerHistory;
import ifc2x3javatoolbox.ifc2x3tc1.IfcPerson;
import ifc2x3javatoolbox.ifc2x3tc1.IfcPersonAndOrganization;
import ifc2x3javatoolbox.ifc2x3tc1.IfcProject;
import ifc2x3javatoolbox.ifc2x3tc1.IfcRelAggregates;
import ifc2x3javatoolbox.ifc2x3tc1.IfcRepresentationContext;
import ifc2x3javatoolbox.ifc2x3tc1.IfcRoot;
import ifc2x3javatoolbox.ifc2x3tc1.IfcSIUnit;
import ifc2x3javatoolbox.ifc2x3tc1.IfcSIUnitName;
import ifc2x3javatoolbox.ifc2x3tc1.IfcSIUnitName.IfcSIUnitName_internal;
import ifc2x3javatoolbox.ifc2x3tc1.IfcText;
import ifc2x3javatoolbox.ifc2x3tc1.IfcTimeStamp;
import ifc2x3javatoolbox.ifc2x3tc1.IfcUnit;
import ifc2x3javatoolbox.ifc2x3tc1.IfcUnitAssignment;
import ifc2x3javatoolbox.ifc2x3tc1.IfcUnitEnum;
import ifc2x3javatoolbox.ifc2x3tc1.IfcUnitEnum.IfcUnitEnum_internal;
import ifc2x3javatoolbox.ifc2x3tc1.InternalAccess;
import ifc2x3javatoolbox.ifc2x3tc1.InternalAccessClass;
import ifc2x3javatoolbox.ifc2x3tc1.LIST;
import ifc2x3javatoolbox.ifc2x3tc1.RootInterface;
import ifc2x3javatoolbox.ifc2x3tc1.SET;
import ifc2x3javatoolbox.ifc2x3tc1.STRING;
import ifc2x3javatoolbox.ifc2x3tc1.TimeStampText;
import ifc2x3javatoolbox.step.parser.IfcStepParser;
import ifc2x3javatoolbox.step.parser.StepParserTokenManager;
import ifc2x3javatoolbox.step.parser.URLFileCache;
import ifc2x3javatoolbox.step.parser.util.ProgressEvent;
import ifc2x3javatoolbox.step.parser.util.StepParserProgressListener;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcModel
{
	public static final String IFCOBJECT = "IFCOBJECT";

	private HashSet<StepParserProgressListener> progressListeners = null;
	private HashSet<IfcModelListener> listenerList = null;
	private SoftReference<HashMap<Class<?>, HashSet<Object>>> typeCache = null;
	private TreeMap<Integer, ClassInterface> entityInstanceNameMap = null;
	private boolean isTypeCacheEnabled = false;
	private File_Name file_Name = null;
	private File_Description file_Description = null;
	private File_Schema file_Schema = null;

	/**
	 * Constructs a new IfcModel Object using standard parameters.
	 * TypeCache is disabled.
	 */
	public IfcModel()
	{
		this(false);
	}
	
	/**
	 * Constructs a new IfcModel Object using the given parameters.
	 * @param isTypeCacheEnabled true for type caching, see {@link IfcModel#setTypeCacheEnabled(boolean)}
	 * otherwise false
	 */
	public IfcModel(boolean isTypeCacheEnabled)
	{
		this.isTypeCacheEnabled = isTypeCacheEnabled;
		this.entityInstanceNameMap = new TreeMap<>();
	}

	/**
	 * Returns the FILE_NAME attribute of the Header section of a STEP file.
	 * @return the FILE_NAME attribute
	 */
	public File_Name getFile_Name()
	{
		return file_Name;
	}

	/**
	 * Sets the FILE_NAME attribute for the Header section of a STEP file.
	 * @param file_Name the FILE_NAME object to be set
	 */
	public void setFile_Name(File_Name file_Name)
	{
		this.file_Name = file_Name;
	}

	/**
	 * Returns the FILE_DESCRIPTION attribute of the Header section of a STEP file.
	 * @return the FILE_DESCRIPTION attribute
	 */
	public File_Description getFile_Description()
	{
		return file_Description;
	}

	/**
	 * Sets the FILE_DESCRIPTION attribute for the Header section of a STEP file.
	 * @param file_Description the FILE_DESCRIPTION object to be set
	 */
	public void setFile_Description(File_Description file_Description)
	{
		this.file_Description = file_Description;
	}

	/**
	 * Returns the FILE_SCHEMA attribute of the Header section of a STEP file.
	 * @return the FILE_SCHEMA attribute
	 */
	public File_Schema getFile_Schema()
	{
		return file_Schema;
	}

	/**
	 * Sets the FILE_SCHEMA attribute for the Header section of a STEP file.
	 * @param file_Schema the FILE_SCHEMA object to be set
	 */
	public void setFile_Schema(File_Schema file_Schema)
	{
		this.file_Schema = file_Schema;
	}

	/**
	 * Returns whether the type caching is enabled or not.
	 * See also @see IfcModel#setTypeSetCacheEnabled(boolean)
	 * @return true, if caching is active, otherwise false
	 */
	public boolean isTypeCacheEnabled() {
		return isTypeCacheEnabled;
	}
	
	/**
	 * This method allows for switch on or off the type caching. If you use
	 * the method @see IfcModel#getCollection(Class<T>) for getting a collection of a specific 
	 * type of objects (e.g. IfcWall.class) the set of objects is cached afterwards.
	 * <br><br>
	 * <b>Attention:</b> Caching is only useful, if and only if you need to have repeatedly
	 * fast access to specific object types! Otherwise, it will only consume memory.
	 *   
	 * @param isTypeSetCacheEnabled true for caching, otherwise false.
	 */
	public void setTypeCacheEnabled(boolean isTypeSetCacheEnabled) {
		this.isTypeCacheEnabled = isTypeSetCacheEnabled;
		if(isTypeSetCacheEnabled == false)
			typeCache.clear();
	}
	
	/**
	 * Clears the cache @see IfcModel#setTypeCacheEnabled(boolean).
	 */
	public void clearTypeSetCache()
	{
		typeCache.clear();
	}
	
	/**
	 * Registers a listener to the model. The listener will be invoked, if model
	 * events occur.
	 * @param listener
	 *            the listener to register
	 */
	public void addIfcModelListener(IfcModelListener listener) {
		if (listenerList == null) 
		{
			listenerList = new HashSet<IfcModelListener>();
		}
		listenerList.add(listener);
	}

	/**
	 * This method removes the specified listener from the model.
	 * @param listener
	 *            the listener to remove
	 */
	public void removeIfcModelListener(IfcModelListener listener) {
		if (listenerList == null) return;
		listenerList.remove(listener);
	}

	/**
	 * This method removes all listeners from this model.
	 */
	public void removeAllIfcModelListeners() {
		listenerList = null;
	}

	/**
	 * This method fires the corresponding IFcModelEvent.
	 * @param event
	 *            the event {@link IfcModelEvent}
	 */
	private void fireModelEvent(IfcModelEvent event) {
		if (listenerList == null) return;
		switch (event.getType())
		{
			case IfcModelEvent.MODEL_FUNDAMENTAL_CHANGE:
			{
				for (IfcModelListener listener : listenerList)
					listener.modelContentChanged();
				break;
			}
			case IfcModelEvent.OBJECTS_ADDED:
			{
				for (IfcModelListener listener : listenerList)
					listener.modelObjectsAdded(event.getObjects());
				break;
			}
			case IfcModelEvent.OBJECTS_REMOVED:
			{
				for (IfcModelListener listener : listenerList)
					listener.modelObjectsRemoved(event.getObjects());
				break;
			}
			case IfcModelEvent.OBJECT_ADDED:
			{
				for (IfcModelListener listener : listenerList)
					listener.modelObjectAdded(event.getObject());
				break;
			}
			case IfcModelEvent.OBJECT_REMOVED:
			{
				for (IfcModelListener listener : listenerList)
					listener.modelObjectRemoved(event.getObject());
				break;
			}
			default:
				break;
		}
	}

	/**
	 * Registers a StepParserProghressListener to the responsible parser object.
	 * Listeners will be informed during the parsing process - see
	 * readStepFile().
	 * @param listener
	 *            the listener object to add
	 */
	public void addStepParserProgressListener(
			StepParserProgressListener listener)
	{
		if (progressListeners == null) progressListeners = new HashSet<StepParserProgressListener>(2,1);
		progressListeners.add(listener);
	}

	/**
	 * Removes a StepParserProghressListener to the responsible parser object.
	 * @param listener
	 *            the listener object to remove
	 */
	public void removeStepParserProgressListener(
			StepParserProgressListener listener)
	{
		if (progressListeners == null) return;
		progressListeners.remove(listener);
		if(progressListeners.isEmpty()) progressListeners = null;
	}

	/**
	 * Removes all registered listeners from the model.
	 */
	public void removeAllStepParserPogressListeners() {
		if (progressListeners == null) return;
		progressListeners = null;
	}
	
	
	
	/**
	 * Returns <code>true</code> if this model contains the specified object.
	 * @param ifcObject object whose presence in this model is to be tested
	 * @return <code>true</code> if this model contains the specified object
	 */
	public boolean containsIfcObject(ClassInterface ifcObject)
	{
		return entityInstanceNameMap.values().contains(ifcObject);
	}

	/**
	 * Returns <code>true</code> if this model contains a mapping for the specified global unique ID.
	 * @param globalUniqueId The global unique ID whose presence in this model is to be tested
	 * @return <code>true</code> if this model contains a mapping for the specified global unique ID.
	 */
	public boolean containsIfcObject(String globalUniqueId) 
	{
		Collection<?> values = null; 
		if(isTypeCacheEnabled) values = getCollection(IfcRoot.class);
		else values = entityInstanceNameMap.values();
		for(Object ifcObject : values)
		{
			if(ifcObject instanceof IfcRoot)
				if(((IfcRoot) ifcObject).getGlobalId().getDecodedValue().equals(globalUniqueId))
					return true;
		}
		return false;
	}
	

	/**
	 * This method returns a map of IFC objects to the corresponding GUIDs. The
	 * key is represented by the IFC objects GUID as String.
	 * @param globalUniqueIDs the requested GUIDs
	 * @return the corresponding objects as HasMap, where the key is the objects GUID
	 *         the value will be null if the requested GUID wasn't found within the model
	 */
	public HashMap<String, ClassInterface> getIfcObjectsByIDs(
			Collection<String> globalUniqueIDs)
	{
		Collection<?> values = null; 
		if(isTypeCacheEnabled) values = getCollection(IfcRoot.class);
		else values = entityInstanceNameMap.values();
		HashMap<String, ClassInterface> ifcObjects = new HashMap<String, ClassInterface>();
		// add all IFC Objects to the resulting set where their GUID is requested
		for(Object ifcObject : values)
		{
			if(ifcObject instanceof IfcRoot)
				if(globalUniqueIDs.contains(((IfcRoot) ifcObject).getGlobalId().getDecodedValue()))
					ifcObjects.put(((IfcRoot) ifcObject).getGlobalId().getDecodedValue(), (ClassInterface)ifcObject);
		}
		// add all GUID's with a null value to the resulting set where their GUID's are not present 
		// within the model
		globalUniqueIDs.retainAll(ifcObjects.keySet());
		for(String nullIds : globalUniqueIDs)
			ifcObjects.put(nullIds, null);
		return ifcObjects;
	}

	/**
	 * This method returns an IFC object to the corresponding GUID
	 * @param globalUniqueId
	 *            the GUID
	 * @return the corresponding object
	 */
	public ClassInterface getIfcObjectByID(String globalUniqueId) {
		Collection<?> values = null; 
		if(isTypeCacheEnabled) values = getCollection(IfcRoot.class);
		else values = entityInstanceNameMap.values();
		for(Object ifcObject : values)
		{
			if(ifcObject instanceof IfcRoot)
				if(((IfcRoot) ifcObject).getGlobalId().getDecodedValue().equals(globalUniqueId))
					return (ClassInterface)ifcObject;
		}
		return null;
	}

	/**
	 * This method returns an IFC object for the specified entity instance name
	 * (aka step line number)
	 * @param entityInstanceName
	 *            the entity instance name
	 * @return the corresponding object or null if no corresponding object
	 *         exists
	 */
	public ClassInterface getIfcObjectByEntityInstanceName(int entityInstanceName) {
		return entityInstanceNameMap.get(entityInstanceName);
	}

	/**
	 * This method returns a treeMap with the entity instance names and the
	 * corresponding IFC objects
	 * @return the treeMap
	 */
	public TreeMap<Integer, ClassInterface> getIfcObjectsSortedByEntityInstanceName()
	{
		return new TreeMap<Integer, ClassInterface>(entityInstanceNameMap);
	}

	/**
	 * This method updates the typeSetCacheMap, if an IFC object was added or
	 * removed from the model
	 * @param ifcObject
	 *            the object that was added or removed
	 * @param isAdded
	 *            true, if the ifcObject was added to the model; false, if it
	 *            was removed
	 */
	private void updateTypeSetCacheMap(ClassInterface ifcObject, boolean isAdded) {
		if(!isTypeCacheEnabled) return;
		if(typeCache == null) return;
		HashMap<Class<?>, HashSet<Object>> typeCacheMap = typeCache.get();
		if(typeCacheMap == null) return;
		HashSet<Class<?>> superClasses = new HashSet<Class<?>>();
		superClasses.add(ifcObject.getClass());
		getAllSuperClasses(ifcObject.getClass(), superClasses);

		for (Class<?> c : superClasses) {
				HashSet<Object> typeSet = typeCacheMap.get(c);
				if (typeSet != null) {
					if (isAdded) typeSet.add(ifcObject);
					else
						typeSet.remove(ifcObject);
			}
		}
	}

	/**
	 * This method collects all the super classes and interfaces of an object
	 * @param c
	 *            the class, whose super classes should be detected
	 * @param superClasses
	 *            container, where the detected super classes will be stored in
	 */
	private void getAllSuperClasses(Class<?> c, HashSet<Class<?>> superClasses)
	{
		for (Class<?> i : c.getInterfaces()) {
			if (!superClasses.contains(i)) {
				superClasses.add(i);
				getAllSuperClasses(i, superClasses);
			}
		}
		Class<?> superClass = c.getSuperclass();
		if (superClass != null && superClass != Object.class) {
			superClasses.add(superClass);
			getAllSuperClasses(superClass, superClasses);
		}
	}

	/**
	 * This method returns the maximum entity instance name (aka step line
	 * number)
	 * @return the maximum entity instance name or 0 if model is empty
	 */
	private int getMaxEntityInstanceName() {
		if (entityInstanceNameMap.isEmpty()) {
			return 0;
		} else {
			return entityInstanceNameMap.lastKey();
		}
	}

	/**
	 * This method adds a collection of IFC Objects to the IfcModel.
	 * @param ifcObjects
	 *            collection of objects to add
	 */
	public void addIfcObjects(Collection<ClassInterface> ifcObjects) {
		for (ClassInterface ifcObject : ifcObjects) {
			int name = getMaxEntityInstanceName() + 1;
			InternalAccess.setStepLineNumber((InternalAccessClass) ifcObject, name);
			entityInstanceNameMap.put(name, ifcObject);
			if(isTypeCacheEnabled) updateTypeSetCacheMap(ifcObject, true);
		}
		fireModelEvent(new IfcModelEvent(IfcModelEvent.OBJECTS_ADDED,
				ifcObjects));
	}

	/**
	 * This method adds a IFC Object to the IfcModel.
	 * @param ifcObject
	 *            object to add
	 */
	public void addIfcObject(ClassInterface ifcObject) {
		int name = getMaxEntityInstanceName() + 1;
		InternalAccess.setStepLineNumber((InternalAccessClass) ifcObject, name);
		entityInstanceNameMap.put(name, ifcObject);
		if(isTypeCacheEnabled) updateTypeSetCacheMap(ifcObject, true);
		fireModelEvent(new IfcModelEvent(IfcModelEvent.OBJECT_ADDED, ifcObject));
	}

	/**
	 * This method clears the model content.
	 */
	public void clearModel() {
		for (ClassInterface ifcObject : entityInstanceNameMap.values()) 
		{
			InternalAccess.destruct((InternalAccessClass) ifcObject);
		}
		typeCache.clear();
		entityInstanceNameMap = null;
		fireModelEvent(new IfcModelEvent(IfcModelEvent.MODEL_FUNDAMENTAL_CHANGE));
	}

	/**
	 * This method removes a collection of IFC Objects from the IfcModel.
	 * @param ifcObject
	 *            collection of IFC objects to remove
	 */
	public void removeIfcObject(ClassInterface ifcObject) {
		entityInstanceNameMap.remove(ifcObject.getStepLineNumber());
		if(isTypeCacheEnabled) updateTypeSetCacheMap(ifcObject, false);
		fireModelEvent(new IfcModelEvent(IfcModelEvent.OBJECT_REMOVED,
				ifcObject));
	}

	/**
	 * This method removes a IFC Object from the IfcModel.
	 * @param ifcObjects
	 *            IFC object to remove
	 */
	public void removeIfcObjects(Collection<ClassInterface> ifcObjects) {
		for (ClassInterface ifcObject : ifcObjects) {
			entityInstanceNameMap.remove(ifcObject.getStepLineNumber());
			if(isTypeCacheEnabled) updateTypeSetCacheMap(ifcObject, false);
		}
		fireModelEvent(new IfcModelEvent(IfcModelEvent.OBJECTS_REMOVED,
				ifcObjects));
	}

	/**
	 * This method returns the number of objects contained in this model.
	 * @return the number of elements
	 */
	public int getNumberOfElements() {
		return entityInstanceNameMap.size();
	}

	/**
	 * This method returns a collection of IFC Objects contained in the model.
	 * The type of collection is specified by the given parameter. The parameter
	 * has to be the the class representation that is requested - e.g.
	 * getCollection(IfcWall.class); If isTypeSetCache is enabled, the queried
	 * class type will be cached. In this meaning, if another query for the same
	 * type is made, the method will return immediately the result, if the cache
	 * is not empty at this time. The cache is automatically cleared if the VM's
	 * memory consumption reaches the upper limit.
	 * @param type
	 *            the requested type of objects
	 * @return a collection of IFC objects specified by the given type,
	 *         contained in the model
	 */
	@SuppressWarnings("unchecked")
	public <T>Collection<T> getCollection(Class<T> type) {
		HashMap<Class<?>, HashSet<Object>> typeCacheMap = null;
		if(isTypeCacheEnabled)
		{
			if(typeCache == null || typeCache.get() == null) 
				{
					typeCacheMap = new HashMap<>();
					typeCache =  new SoftReference<HashMap<Class<?>,HashSet<Object>>>(typeCacheMap);
				}
			typeCacheMap = typeCache.get();
			if(typeCacheMap != null) 
			if (typeCacheMap.get(type) != null) return (Collection<T>) typeCacheMap.get(type).clone();
		}	
		HashSet<Object> typeSet = new HashSet<Object>();
		for (Object currentObject : entityInstanceNameMap.values()) {
			if (type.isInstance(currentObject)) {
				typeSet.add(currentObject);
			}
		}
		if(isTypeCacheEnabled) typeCacheMap.put(type, typeSet);
		return (Collection<T>) typeSet.clone();
	}

	/**
	 * This method returns a collection with all IFC objects currently contained
	 * in the IfcModel
	 * @return a collection of all IFC objects
	 */
	public Collection<ClassInterface> getIfcObjects() {
		return entityInstanceNameMap.values();
	}

	private IfcStepParser initReadStepFile() {
		IfcStepParser parser = new IfcStepParser();
		if (progressListeners != null) {
			for (StepParserProgressListener listener : progressListeners)
				parser.addStepParserProgressListener(listener);
		}
		return parser;
	}

	private void finishReadStepFile(IfcStepParser parser) {
		entityInstanceNameMap = new TreeMap<Integer, ClassInterface>(
				parser.getEntityInstanceNameMap());
		this.file_Description = parser.getFile_Description();
		this.file_Name = parser.getFile_Name();
		this.file_Schema = parser.getFile_Schema();
		parser.removeAllStepParserPogressListeners();
		parser.destruct();
		parser = null;
		StepParserTokenManager.removeAllStepParserPogressListeners();
		fireProgressEvent(new ProgressEvent(0, " "));
		fireModelEvent(new IfcModelEvent(IfcModelEvent.MODEL_FUNDAMENTAL_CHANGE));
	}

	/**
	 * This method reads an IFCZIP file from the specified {@link File} and initializes the described Objects. 
	 * Those objects can be accessed and manipulated using the IfcModel's methods.
	 * @param file the file to be read from
	 * @throws Exception if an IO failure occurs
	 */
	public void readIfcZipFile(File file) throws Exception 
	{
		IfcStepParser parser = initReadStepFile();
		parser.readIfcZipFile(file);
		finishReadStepFile(parser);
	}
	
	/**
	 * This method reads an IFCZIP file from the specified {@link URL} and initializes the described Objects. 
	 * Those objects can be accessed and manipulated using the IfcModel's methods.
	 * @param url the web address to be read from
	 * @throws Exception if an IO failure occurs
	 */
	public void readIfcZipFile(URL url) throws Exception
	{
		URLFileCache urlFileCache = new URLFileCache();
		urlFileCache.loadZipFile(url.openStream());
		IfcStepParser parser = initReadStepFile();
		parser.readStepFile(urlFileCache);
		finishReadStepFile(parser);
	}
	
	/**
	 * This method reads an IFCZIP file from the specified {@link InputStream} and initializes the described Objects. 
	 * Those objects can be accessed and manipulated using the IfcModel's methods.
	 * @param inputStream the data source to be read from
	 * @throws Exception if an IO failure occurs
	 */
	public void readIfcZipFile(InputStream inputStream) throws Exception
	{
		URLFileCache urlFileCache = new URLFileCache();
		urlFileCache.loadZipFile(inputStream);
		IfcStepParser parser = initReadStepFile();
		parser.readStepFile(urlFileCache);
		finishReadStepFile(parser);
	}

	/**
	 * This method reads an IFC STEP file from the specified {@link URLFileCache} and initializes the described Objects. 
	 * Those objects can be accessed and manipulated using the IfcModel's methods.
	 * @param urlFileCache the cached IFC STEP file to be read from
	 * @throws Exception if an IO failure occurs
	 */
	public void readStepFile(URLFileCache urlFileCache) throws Exception 
	{
		IfcStepParser parser = initReadStepFile();
		parser.readStepFile(urlFileCache);
		finishReadStepFile(parser);
	}

	/**
	 * This method reads an IFC STEP file from the specified {@link URL} and initializes the described Objects. 
	 * Those objects can be accessed and manipulated using the IfcModel's methods.
	 * @param url the web address to be read from
	 * @throws Exception if an IO failure occurs
	 */
	public void readStepFile(URL url) throws Exception 
	{
		IfcStepParser parser = initReadStepFile();
		parser.readStepFile(url);
		finishReadStepFile(parser);
	}

	/**
	 * This method reads an IFC STEP file from the specified {@link File} and initializes the described Objects. 
	 * Those objects can be accessed and manipulated using the IfcModel's methods.
	 * @param file the file to be read from
	 * @throws Exception if an IO failure occurs
	 */
	public void readStepFile(File file) throws Exception 
	{
		IfcStepParser parser = initReadStepFile();
		parser.readStepFile(file);
		finishReadStepFile(parser);
	}
	
	/**
	 * This method reads an IFC STEP file from the specified {@link InputStream} and initializes the described Objects. 
	 * Those objects can be accessed and manipulated using the IfcModel's methods.
	 * @param inputStream the data source to be read from
	 * @throws Exception if an IO failure occurs
	 */
	public void readStepFile(InputStream inputStream) throws Exception
	{
		URLFileCache urlFileCache = new URLFileCache();
		urlFileCache.loadFile(inputStream);
		IfcStepParser parser = initReadStepFile();
		parser.readStepFile(urlFileCache);
		finishReadStepFile(parser);
	}
	
	/**
	 * Internal method to write an IFCZIP file to the specified {@link ZipOutputStream}.
	 * @param zipOutputStream the data sink
	 * @param fileName the file name used for the STEP file ZIP entry
	 * @param filePath the path to the file in the file system (used in IFC header)
	 * @throws IOException if an IO failure occurs
	 */
	private void writeIfcZipFile(ZipOutputStream zipOutputStream, String fileName, String filePath) throws IOException
	{
		if( ! fileName.endsWith(".ifc"))
			fileName += ".ifc";
		ZipEntry zipEntry = new ZipEntry(fileName);
		zipOutputStream.putNextEntry(zipEntry);
		writeStepFile(zipOutputStream, filePath);
	}
	
	/**
	 * Writes an IFCZIP file that represents the IfcModel's content to the specified {@link File}.
	 * @param file the file where the IFCZIP file should be written to
	 * @throws IOException if an IO failure occurs
	 */
	public void writeIfcZipFile(File file) throws IOException
	{
		ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
		String fileName = file.getName().replace(".zip", "").replace(".ifczip", "");
		String filePath = file.getAbsolutePath();
		writeIfcZipFile(zipOutputStream, fileName, filePath);
	}
	
	/**
	 * Writes an IFCZIP file that represents the IfcModel's content to the specified {@link URL}.
	 * @param url the web address where the IFCZIP file should be written to
	 * @throws IOException if an IO failure occurs
	 */
	public void writeIfcZipFile(URL url) throws IOException
	{
		ZipOutputStream zipOutputStream = new ZipOutputStream(url.openConnection().getOutputStream());
		String fileName = "file";
		String filePath = "file";
		writeIfcZipFile(zipOutputStream, fileName, filePath);
	}
	
	/**
	 * Writes an IFCZIP file that represents the IfcModel's content to the specified {@link OutputStream}.
	 * @param outputStream the data sink where the IFCZIP file should be written to
	 * @throws IOException if an IO failure occurs
	 */
	public void writeIfcZipFile(OutputStream outputStream) throws IOException
	{
		ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
		String fileName = "file";
		String filePath = "file";
		writeIfcZipFile(zipOutputStream, fileName, filePath);
	}

	/**
	 * Writes an IFCZIP file that represents the IfcModel's content to the specified {@link File}.
	 * @param ifcZipFile the file where the IFCZIP file should be written to
	 * @param ifcStepFileName the file name used for the STEP file ZIP entry
	 * @throws IOException if an IO failure occurs
	 * @deprecated use instead one of {@link #writeIfcZipFile(File)}, {@link #writeIfcZipFile(URL)} or {@link #writeIfcZipFile(OutputStream)}
	 */
	@Deprecated
	public void writeIfcZipStepfile(File ifcZipFile, String ifcStepFileName) throws IOException
	{
		ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(ifcZipFile));
		String filePath = ifcZipFile.getAbsolutePath();
		writeIfcZipFile(zipOutputStream, ifcStepFileName, filePath);
	}
	
	/**
	 * Internal method to write the IFC file header to the specified {@link OutputStream}
	 * @param outputStream the data sink where the IFC header should be written to
	 * @param filePath the path to the file in the file system (used in IFC header)
	 * @throws IOException if an IO failure occurs
	 */
	private void writeStepFileHeader(OutputStream outputStream, String filePath) throws IOException
	{
		outputStream.write("ISO-10303-21;\n".getBytes());
		outputStream.write("HEADER;\n".getBytes());
		
		//FILE_DESCRIPTION
		if(file_Description == null)
		{
			file_Description = new File_Description();
		}
		if(file_Description.getdescription() == null || file_Description.getdescription().isEmpty())
		{
			LIST<STRING> description = new LIST<>();
			description.add(new STRING("ViewDefinition [CoordinationView]", true));
			file_Description.setdescription(description); //formal definition of the underlying view definition
		}
		if(file_Description.getimplementationLevel() == null)
		{
			file_Description.setimplementationLevel(new STRING("2;1", true)); //see ISO10303-21, currently always 2;1 for IFC files
		}
		String fileDescriptionString = file_Description.getStepLine().split("=")[1].trim()+"\n";
		outputStream.write(fileDescriptionString.getBytes());
		
		//FILE_NAME
		if(file_Name == null)
		{
			file_Name = new File_Name();
		}
		file_Name.setname(new STRING(filePath.replace("\\", "/"), false)); //local path and file name of the IFC export file
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		String date = sdf.format(new Date());
		file_Name.settimeStamp(new TimeStampText(new STRING(date, true))); //time of creation of the IFC export file
		if(file_Name.getauthor() == null || file_Name.getauthor().isEmpty())
		{
			LIST<STRING> author = new LIST<>();
			author.add(new STRING("Unknown Author", true));
			author.add(new STRING("info@ifctoolsproject.com", true));
			file_Name.setauthor(author); //user defined field to capture the author/creator of the IFC file
		}
		if(file_Name.getorganization() == null || file_Name.getorganization().isEmpty())
		{
			LIST<STRING> organization = new LIST<>();
			organization.add(new STRING("Unknown Organization", true));
			file_Name.setorganization(organization); //user defined field to capture the organization of the author
		}
		file_Name.setpreprocessorVersion(new STRING("IFC Tools Project - IFC2x3 Java Toolbox", true)); //name of the toolbox used to create the IFC file 
		if(file_Name.getoriginatingSystem() == null)
		{
			file_Name.setoriginatingSystem(new STRING("IFC2x3 Java Toolbox 2.0", true)); //name of the application (including built number)
		}
		if(file_Name.getauthorization() == null)
		{
			file_Name.setauthorization(new STRING("Unknown Authorizer", true)); //user defined field to capture the authorizer of the IFC file
		}
		String fileNameString = file_Name.getStepLine().split("=")[1].trim()+"\n";
		outputStream.write(fileNameString.getBytes());
		
		//FILE_SCHEMA
		outputStream.write("FILE_SCHEMA(('IFC2X3'));\n".getBytes());
		
		outputStream.write("ENDSEC;\n\n".getBytes());
		outputStream.write("DATA;\n".getBytes());
	}
	
	/**
	 * Internal method to write an IFC STEP file to the specified {@link OutputStream}.
	 * @param outputStream the data sink, where the content should be streamed to
	 * @param filePath the path to the file in the file system (used in IFC header)
	 * @throws IOException if an IO failure occurs
	 */
	private void writeStepFile(OutputStream outputStream, String filePath) throws IOException
	{
		writeStepFileHeader(outputStream, filePath);
		checkAndSetMinimumRequirements();
		for (Object object : entityInstanceNameMap.values()) {
			if (object instanceof RootInterface) {
				RootInterface ifcObject = (RootInterface) object;
				outputStream.write((ifcObject.getStepLine() + "\n").getBytes());
			}
		}
		outputStream.write("ENDSEC;\n\n".getBytes());
		outputStream.write("END-ISO-10303-21;\n\n".getBytes());
		outputStream.flush();
		outputStream.close();
	}

	
	/**
	 * Writes an IFC STEP file that represents the IfcModel's content to the specified {@link File}.
	 * @param file the file where the IFC STEP file should be written to
	 * @throws IOException if an IO failure occurs
	 */
	public void writeStepfile(File file) throws IOException 
	{
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		writeStepFile(fileOutputStream, file.getAbsolutePath());
	}
	
	/**
	 * Writes an IFC STEP file that represents the IfcModel's content to the specified {@link URL}.
	 * @param url the web address where the IFC STEP file should be written to
	 * @throws IOException if an IO failure occurs
	 */
	public void writeStepfile(URL url) throws IOException
	{
		OutputStream outputStream = url.openConnection().getOutputStream();
		writeStepFile(outputStream, "file.ifc");
	}
	
	/**
	 * Writes an IFC STEP file that represents the IfcModel's content to the specified {@link OutputStream}.
	 * @param outputStream the data sink, where the content should be streamed to
	 * @throws IOException if an IO failure occurs
	 */
	public void writeStepfile(OutputStream outputStream) throws IOException
	{
		writeStepFile(outputStream, "file.ifc");
	}

	private void fireProgressEvent(ProgressEvent event) {
		if (progressListeners != null) {
			for (StepParserProgressListener listener : progressListeners) {
				listener.progressActionPerformed(event);
			}
		}
	}

	/**
	 * This method returns the IfcProject of the IfcModel.
	 * @return the IfcProject
	 * @throws IllegalArgumentException
	 *             if more than one IfcProject will be found in the model.
	 */
	public IfcProject getIfcProject() throws IllegalArgumentException {
		Collection<IfcProject> projects = getCollection(IfcProject.class);
		if (projects != null && projects.size() > 0) {
			if (projects.size() > 1) throw new IllegalArgumentException(
					"More than one IfcProject detected!");
			return projects.iterator().next();
		}
		return null;
	}

	/**
	 * This method generates a UUID and compresses it to a 22 character long
	 * String according to the algorithm given in the IFC documentation.
	 * @return compressed id string
	 */
	public STRING getNewGlobalUniqueId() {
		return new STRING(GuidCompressor.getNewIfcGloballyUniqueId(), true);
	}

	/**
	 * This method checks if the IFC Model has an IfcProject. If not, the method
	 * sets an IfcProject and all necessary classes related to it.
	 */
	public void checkAndSetMinimumRequirements() {
		if (getIfcProject() != null) return;

		ArrayList<ClassInterface> newObjects = new ArrayList<ClassInterface>();

		// OwningUser, OwningApplication
		IfcPerson ifcPerson = new IfcPerson(null,
				new IfcLabel("unknown", true), new IfcLabel("user", true),
				null, null, null, null, null);
		newObjects.add(ifcPerson);
		IfcOrganization ifcOrganization = new IfcOrganization(null,
				new IfcLabel("ifctoolsproject.com", true), null, null, null);
		newObjects.add(ifcOrganization);
		IfcPersonAndOrganization ifcPersonAndOrganization = new IfcPersonAndOrganization(
				ifcPerson, ifcOrganization, null);
		newObjects.add(ifcPersonAndOrganization);
		IfcApplication ifcApplication = new IfcApplication(ifcOrganization,
				new IfcLabel("1.0", true), new IfcLabel("ifctoolsproject.com",
						true), new IfcIdentifier("ifctoolsproject.com", true));
		newObjects.add(ifcApplication);

		IfcOwnerHistory ifcOwnerHistory = new IfcOwnerHistory(
				ifcPersonAndOrganization, ifcApplication, null,
				new IfcChangeActionEnum(IfcChangeActionEnum_internal.ADDED
						.name()), null, null,
				null, new IfcTimeStamp(
						(int) (System.currentTimeMillis() / 1000)));
		newObjects.add(ifcOwnerHistory);

		// WorldCoordinateSystem
		LIST<IfcLengthMeasure> coordinates = new LIST<IfcLengthMeasure>();
		coordinates.add(new IfcLengthMeasure(0.0));
		coordinates.add(new IfcLengthMeasure(0.0));
		coordinates.add(new IfcLengthMeasure(0.0));
		IfcCartesianPoint origin = new IfcCartesianPoint(coordinates);
		newObjects.add(origin);
		IfcAxis2Placement3D worldCoordinateSystem = new IfcAxis2Placement3D(
				origin, null, null);
		newObjects.add(worldCoordinateSystem);

		// RepresentationContexts
		IfcGeometricRepresentationContext ifcGeometricRepresentationContext = new IfcGeometricRepresentationContext(
				null, new IfcLabel("Model", true), new IfcDimensionCount(3),
				new DOUBLE(1.0E-5), worldCoordinateSystem, null);
		newObjects.add(ifcGeometricRepresentationContext);
		SET<IfcRepresentationContext> contexts = new SET<IfcRepresentationContext>();
		contexts.add(ifcGeometricRepresentationContext);

		// UnitsInContext
		SET<IfcUnit> units = new SET<IfcUnit>();
		IfcSIUnit lengthUnit = new IfcSIUnit(null, new IfcUnitEnum(
				IfcUnitEnum_internal.LENGTHUNIT.name()), null,
				new IfcSIUnitName(IfcSIUnitName_internal.METRE.name()));
		newObjects.add(lengthUnit);
		units.add(lengthUnit);
		IfcSIUnit planeAngleUnit = new IfcSIUnit(null, new IfcUnitEnum(
				IfcUnitEnum_internal.PLANEANGLEUNIT.name()), null,
				new IfcSIUnitName(IfcSIUnitName_internal.RADIAN.name()));
		newObjects.add(planeAngleUnit);
		units.add(planeAngleUnit);
		IfcSIUnit timeUnit = new IfcSIUnit(null, new IfcUnitEnum(
				IfcUnitEnum_internal.TIMEUNIT.name()), null, new IfcSIUnitName(
				IfcSIUnitName_internal.SECOND.name()));
		newObjects.add(timeUnit);
		units.add(timeUnit);
		IfcUnitAssignment ifcUnitAssignment = new IfcUnitAssignment(units);
		newObjects.add(ifcUnitAssignment);

		// IfcProject
		IfcProject ifcProject = new IfcProject(new IfcGloballyUniqueId(
				getNewGlobalUniqueId()), ifcOwnerHistory, new IfcLabel(
				"Default Project", true), new IfcText(
				"Description of Default Project", true), null, null, null,
				contexts, ifcUnitAssignment);
		newObjects.add(ifcProject);

		// MINIMUM SPATIAL STRUCTURE: 1xIfcProject, 1xIfcBuilding,
		// 1xIfcBuildingStorey
		IfcLocalPlacement ifcLocalPlacement = new IfcLocalPlacement(null,
				worldCoordinateSystem);
		newObjects.add(ifcLocalPlacement);
		IfcBuilding ifcBuilding = new IfcBuilding(new IfcGloballyUniqueId(
				getNewGlobalUniqueId()), ifcOwnerHistory, new IfcLabel(
				"Default Building", true), new IfcText("Description", true),
				null, ifcLocalPlacement, null, null,
				new IfcElementCompositionEnum("ELEMENT"), null, null, null);
		newObjects.add(ifcBuilding);
		IfcBuildingStorey ifcBuildingStorey = new IfcBuildingStorey(
				new IfcGloballyUniqueId(getNewGlobalUniqueId()),
				ifcOwnerHistory, new IfcLabel("Default Building Storey", true),
				new IfcText("Description", true), null, ifcLocalPlacement,
				null, null, new IfcElementCompositionEnum("ELEMENT"), null);
		newObjects.add(ifcBuildingStorey);
		// relation IfcProject --> IfcBuilding
		SET<IfcObjectDefinition> relatedObjects;
		relatedObjects = new SET<IfcObjectDefinition>();
		relatedObjects.add(ifcBuilding);
		IfcRelAggregates relation;
		relation = new IfcRelAggregates(new IfcGloballyUniqueId(
				getNewGlobalUniqueId()), ifcOwnerHistory, null, null,
				ifcProject, relatedObjects);
		newObjects.add(relation);
		// relation IfcBuilding --> IfcBuildingStorey
		relatedObjects = new SET<IfcObjectDefinition>();
		relatedObjects.add(ifcBuildingStorey);
		relation = new IfcRelAggregates(new IfcGloballyUniqueId(
				getNewGlobalUniqueId()), ifcOwnerHistory, null, null,
				ifcBuilding, relatedObjects);
		newObjects.add(relation);

		// add all new IFC-objects to the model
		addIfcObjects(newObjects);
	}
}
