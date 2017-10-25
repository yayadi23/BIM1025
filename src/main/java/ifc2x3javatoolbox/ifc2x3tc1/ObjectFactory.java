package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class ObjectFactory extends java.util.HashMap<String, ObjectFactory.ClassBuilder>
{	private static final long serialVersionUID = 1L;
	public static java.util.HashMap<String, ObjectFactory.ClassBuilder> FACTORY_MAP = new ObjectFactory();

	interface ClassBuilder
	{
		Object instance();
	}

	public static Object createInstance(String entityName)
	{
		return FACTORY_MAP.get(entityName).instance();
	}

	public ObjectFactory()
	{
		this.put("IFCSEQUENCEENUM", new IfcSequenceEnumBuilder());
		this.put("IFCWORKCONTROLTYPEENUM", new IfcWorkControlTypeEnumBuilder());
		this.put("IFCINTEGERCOUNTRATEMEASURE", new IfcIntegerCountRateMeasureBuilder());
		this.put("IFCPROFILETYPEENUM", new IfcProfileTypeEnumBuilder());
		this.put("IFCMODULUSOFSUBGRADEREACTIONMEASURE", new IfcModulusOfSubgradeReactionMeasureBuilder());
		this.put("IFCRATIOMEASURE", new IfcRatioMeasureBuilder());
		this.put("IFCARITHMETICOPERATORENUM", new IfcArithmeticOperatorEnumBuilder());
		this.put("IFCSERVICELIFEFACTORTYPEENUM", new IfcServiceLifeFactorTypeEnumBuilder());
		this.put("IFCTRIMMINGPREFERENCE", new IfcTrimmingPreferenceBuilder());
		this.put("IFCENVIRONMENTALIMPACTCATEGORYENUM", new IfcEnvironmentalImpactCategoryEnumBuilder());
		this.put("IFCPROPERTYSOURCEENUM", new IfcPropertySourceEnumBuilder());
		this.put("IFCDOCUMENTSTATUSENUM", new IfcDocumentStatusEnumBuilder());
		this.put("IFCWINDOWSTYLECONSTRUCTIONENUM", new IfcWindowStyleConstructionEnumBuilder());
		this.put("IFCSTATEENUM", new IfcStateEnumBuilder());
		this.put("IFCPLATETYPEENUM", new IfcPlateTypeEnumBuilder());
		this.put("IFCCONDENSERTYPEENUM", new IfcCondenserTypeEnumBuilder());
		this.put("IFCPHYSICALORVIRTUALENUM", new IfcPhysicalOrVirtualEnumBuilder());
		this.put("IFCELECTRICCHARGEMEASURE", new IfcElectricChargeMeasureBuilder());
		this.put("IFCMASSFLOWRATEMEASURE", new IfcMassFlowRateMeasureBuilder());
		this.put("IFCPOSITIVELENGTHMEASURE", new IfcPositiveLengthMeasureBuilder());
		this.put("IFCVOLUMETRICFLOWRATEMEASURE", new IfcVolumetricFlowRateMeasureBuilder());
		this.put("IFCCOMPOUNDPLANEANGLEMEASURE", new IfcCompoundPlaneAngleMeasureBuilder());
		this.put("IFCYEARNUMBER", new IfcYearNumberBuilder());
		this.put("IFCELEMENTCOMPOSITIONENUM", new IfcElementCompositionEnumBuilder());
		this.put("IFCJUNCTIONBOXTYPEENUM", new IfcJunctionBoxTypeEnumBuilder());
		this.put("IFCCOOLINGTOWERTYPEENUM", new IfcCoolingTowerTypeEnumBuilder());
		this.put("IFCTIMESTAMP", new IfcTimeStampBuilder());
		this.put("IFCCOMPLEXNUMBER", new IfcComplexNumberBuilder());
		this.put("IFCSANITARYTERMINALTYPEENUM", new IfcSanitaryTerminalTypeEnumBuilder());
		this.put("IFCTHERMALRESISTANCEMEASURE", new IfcThermalResistanceMeasureBuilder());
		this.put("IFCTUBEBUNDLETYPEENUM", new IfcTubeBundleTypeEnumBuilder());
		this.put("IFCNORMALISEDRATIOMEASURE", new IfcNormalisedRatioMeasureBuilder());
		this.put("IFCACTIONSOURCETYPEENUM", new IfcActionSourceTypeEnumBuilder());
		this.put("IFCDAYLIGHTSAVINGHOUR", new IfcDaylightSavingHourBuilder());
		this.put("SCHEMANAME", new SchemaNameBuilder());
		this.put("IFCLUMINOUSINTENSITYMEASURE", new IfcLuminousIntensityMeasureBuilder());
		this.put("IFCELECTRICTIMECONTROLTYPEENUM", new IfcElectricTimeControlTypeEnumBuilder());
		this.put("IFCPUMPTYPEENUM", new IfcPumpTypeEnumBuilder());
		this.put("IFCROTATIONALSTIFFNESSMEASURE", new IfcRotationalStiffnessMeasureBuilder());
		this.put("IFCLINEARFORCEMEASURE", new IfcLinearForceMeasureBuilder());
		this.put("IFCPROJECTORDERTYPEENUM", new IfcProjectOrderTypeEnumBuilder());
		this.put("IFCTIMEMEASURE", new IfcTimeMeasureBuilder());
		this.put("IFCTEXTFONTNAME", new IfcTextFontNameBuilder());
		this.put("IFCDIMENSIONEXTENTUSAGE", new IfcDimensionExtentUsageBuilder());
		this.put("TIMESTAMPTEXT", new TimeStampTextBuilder());
		this.put("IFCOBJECTIVEENUM", new IfcObjectiveEnumBuilder());
		this.put("IFCSPECULARROUGHNESS", new IfcSpecularRoughnessBuilder());
		this.put("IFCELECTRICCAPACITANCEMEASURE", new IfcElectricCapacitanceMeasureBuilder());
		this.put("IFCRADIOACTIVITYMEASURE", new IfcRadioActivityMeasureBuilder());
		this.put("IFCMAGNETICFLUXMEASURE", new IfcMagneticFluxMeasureBuilder());
		this.put("IFCMEMBERTYPEENUM", new IfcMemberTypeEnumBuilder());
		this.put("IFCSOLIDANGLEMEASURE", new IfcSolidAngleMeasureBuilder());
		this.put("IFCSIPREFIX", new IfcSIPrefixBuilder());
		this.put("IFCGLOBALORLOCALENUM", new IfcGlobalOrLocalEnumBuilder());
		this.put("IFCACTUATORTYPEENUM", new IfcActuatorTypeEnumBuilder());
		this.put("IFCROTATIONALFREQUENCYMEASURE", new IfcRotationalFrequencyMeasureBuilder());
		this.put("IFCELEMENTASSEMBLYTYPEENUM", new IfcElementAssemblyTypeEnumBuilder());
		this.put("IFCDAYINMONTHNUMBER", new IfcDayInMonthNumberBuilder());
		this.put("IFCCURRENCYENUM", new IfcCurrencyEnumBuilder());
		this.put("IFCPRESSUREMEASURE", new IfcPressureMeasureBuilder());
		this.put("IFCENERGYSEQUENCEENUM", new IfcEnergySequenceEnumBuilder());
		this.put("IFCGASTERMINALTYPEENUM", new IfcGasTerminalTypeEnumBuilder());
		this.put("IFCWALLTYPEENUM", new IfcWallTypeEnumBuilder());
		this.put("IFCBSPLINECURVEFORM", new IfcBSplineCurveFormBuilder());
		this.put("IFCSERVICELIFETYPEENUM", new IfcServiceLifeTypeEnumBuilder());
		this.put("IFCMINUTEINHOUR", new IfcMinuteInHourBuilder());
		this.put("IFCPROJECTORDERRECORDTYPEENUM", new IfcProjectOrderRecordTypeEnumBuilder());
		this.put("IFCTEXT", new IfcTextBuilder());
		this.put("IFCSURFACESIDE", new IfcSurfaceSideBuilder());
		this.put("IFCCONTROLLERTYPEENUM", new IfcControllerTypeEnumBuilder());
		this.put("IFCFORCEMEASURE", new IfcForceMeasureBuilder());
		this.put("IFCFLOWMETERTYPEENUM", new IfcFlowMeterTypeEnumBuilder());
		this.put("IFCSOUNDPRESSUREMEASURE", new IfcSoundPressureMeasureBuilder());
		this.put("IFCFONTVARIANT", new IfcFontVariantBuilder());
		this.put("IFCACCELERATIONMEASURE", new IfcAccelerationMeasureBuilder());
		this.put("IFCELECTRICDISTRIBUTIONPOINTFUNCTIONENUM", new IfcElectricDistributionPointFunctionEnumBuilder());
		this.put("IFCFREQUENCYMEASURE", new IfcFrequencyMeasureBuilder());
		this.put("IFCBENCHMARKENUM", new IfcBenchmarkEnumBuilder());
		this.put("IFCCHANGEACTIONENUM", new IfcChangeActionEnumBuilder());
		this.put("IFCCABLESEGMENTTYPEENUM", new IfcCableSegmentTypeEnumBuilder());
		this.put("IFCMASSDENSITYMEASURE", new IfcMassDensityMeasureBuilder());
		this.put("IFCLUMINOUSFLUXMEASURE", new IfcLuminousFluxMeasureBuilder());
		this.put("IFCLABEL", new IfcLabelBuilder());
		this.put("IFCDUCTSILENCERTYPEENUM", new IfcDuctSilencerTypeEnumBuilder());
		this.put("IFCDOORSTYLECONSTRUCTIONENUM", new IfcDoorStyleConstructionEnumBuilder());
		this.put("IFCLAMPTYPEENUM", new IfcLampTypeEnumBuilder());
		this.put("IFCFONTWEIGHT", new IfcFontWeightBuilder());
		this.put("IFCROLEENUM", new IfcRoleEnumBuilder());
		this.put("IFCREFLECTANCEMETHODENUM", new IfcReflectanceMethodEnumBuilder());
		this.put("IFCWINDOWPANELOPERATIONENUM", new IfcWindowPanelOperationEnumBuilder());
		this.put("IFCSURFACETEXTUREENUM", new IfcSurfaceTextureEnumBuilder());
		this.put("IFCELECTRICCURRENTMEASURE", new IfcElectricCurrentMeasureBuilder());
		this.put("IFCASSEMBLYPLACEENUM", new IfcAssemblyPlaceEnumBuilder());
		this.put("IFCEVAPORATIVECOOLERTYPEENUM", new IfcEvaporativeCoolerTypeEnumBuilder());
		this.put("IFCSPECIFICHEATCAPACITYMEASURE", new IfcSpecificHeatCapacityMeasureBuilder());
		this.put("IFCDATAORIGINENUM", new IfcDataOriginEnumBuilder());
		this.put("IFCFILTERTYPEENUM", new IfcFilterTypeEnumBuilder());
		this.put("IFCPOSITIVERATIOMEASURE", new IfcPositiveRatioMeasureBuilder());
		this.put("IFCTEXTTRANSFORMATION", new IfcTextTransformationBuilder());
		this.put("IFCDIRECTIONSENSEENUM", new IfcDirectionSenseEnumBuilder());
		this.put("IFCTEXTPATH", new IfcTextPathBuilder());
		this.put("IFCMONETARYMEASURE", new IfcMonetaryMeasureBuilder());
		this.put("IFCELECTRICFLOWSTORAGEDEVICETYPEENUM", new IfcElectricFlowStorageDeviceTypeEnumBuilder());
		this.put("IFCTORQUEMEASURE", new IfcTorqueMeasureBuilder());
		this.put("IFCWINDOWSTYLEOPERATIONENUM", new IfcWindowStyleOperationEnumBuilder());
		this.put("IFCILLUMINANCEMEASURE", new IfcIlluminanceMeasureBuilder());
		this.put("IFCTRANSFORMERTYPEENUM", new IfcTransformerTypeEnumBuilder());
		this.put("IFCANALYSISTHEORYTYPEENUM", new IfcAnalysisTheoryTypeEnumBuilder());
		this.put("IFCFLOWINSTRUMENTTYPEENUM", new IfcFlowInstrumentTypeEnumBuilder());
		this.put("IFCHUMIDIFIERTYPEENUM", new IfcHumidifierTypeEnumBuilder());
		this.put("IFCMAGNETICFLUXDENSITYMEASURE", new IfcMagneticFluxDensityMeasureBuilder());
		this.put("IFCCURVATUREMEASURE", new IfcCurvatureMeasureBuilder());
		this.put("IFCKINEMATICVISCOSITYMEASURE", new IfcKinematicViscosityMeasureBuilder());
		this.put("IFCPHMEASURE", new IfcPHMeasureBuilder());
		this.put("IFCHEATFLUXDENSITYMEASURE", new IfcHeatFluxDensityMeasureBuilder());
		this.put("IFCCONNECTIONTYPEENUM", new IfcConnectionTypeEnumBuilder());
		this.put("IFCRAMPFLIGHTTYPEENUM", new IfcRampFlightTypeEnumBuilder());
		this.put("IFCSPECULAREXPONENT", new IfcSpecularExponentBuilder());
		this.put("IFCMASSMEASURE", new IfcMassMeasureBuilder());
		this.put("IFCTHERMALLOADSOURCEENUM", new IfcThermalLoadSourceEnumBuilder());
		this.put("IFCEVAPORATORTYPEENUM", new IfcEvaporatorTypeEnumBuilder());
		this.put("IFCSECTIONTYPEENUM", new IfcSectionTypeEnumBuilder());
		this.put("IFCDOORPANELPOSITIONENUM", new IfcDoorPanelPositionEnumBuilder());
		this.put("IFCSIUNITNAME", new IfcSIUnitNameBuilder());
		this.put("IFCWASTETERMINALTYPEENUM", new IfcWasteTerminalTypeEnumBuilder());
		this.put("IFCUNITENUM", new IfcUnitEnumBuilder());
		this.put("IFCTIMESERIESSCHEDULETYPEENUM", new IfcTimeSeriesScheduleTypeEnumBuilder());
		this.put("IFCLIGHTEMISSIONSOURCEENUM", new IfcLightEmissionSourceEnumBuilder());
		this.put("IFCELECTRICRESISTANCEMEASURE", new IfcElectricResistanceMeasureBuilder());
		this.put("IFCTHERMALCONDUCTIVITYMEASURE", new IfcThermalConductivityMeasureBuilder());
		this.put("IFCELECTRICMOTORTYPEENUM", new IfcElectricMotorTypeEnumBuilder());
		this.put("IFCLIGHTFIXTURETYPEENUM", new IfcLightFixtureTypeEnumBuilder());
		this.put("IFCBUILDINGELEMENTPROXYTYPEENUM", new IfcBuildingElementProxyTypeEnumBuilder());
		this.put("IFCPILETYPEENUM", new IfcPileTypeEnumBuilder());
		this.put("IFCTHERMODYNAMICTEMPERATUREMEASURE", new IfcThermodynamicTemperatureMeasureBuilder());
		this.put("IFCDOORPANELOPERATIONENUM", new IfcDoorPanelOperationEnumBuilder());
		this.put("IFCFONTSTYLE", new IfcFontStyleBuilder());
		this.put("IFCLENGTHMEASURE", new IfcLengthMeasureBuilder());
		this.put("IFCMOMENTOFINERTIAMEASURE", new IfcMomentOfInertiaMeasureBuilder());
		this.put("IFCREAL", new IfcRealBuilder());
		this.put("IFCCURTAINWALLTYPEENUM", new IfcCurtainWallTypeEnumBuilder());
		this.put("IFCWARPINGMOMENTMEASURE", new IfcWarpingMomentMeasureBuilder());
		this.put("IFCCOUNTMEASURE", new IfcCountMeasureBuilder());
		this.put("IFCIONCONCENTRATIONMEASURE", new IfcIonConcentrationMeasureBuilder());
		this.put("IFCPLANEANGLEMEASURE", new IfcPlaneAngleMeasureBuilder());
		this.put("IFCELECTRICCONDUCTANCEMEASURE", new IfcElectricConductanceMeasureBuilder());
		this.put("IFCFIRESUPPRESSIONTERMINALTYPEENUM", new IfcFireSuppressionTerminalTypeEnumBuilder());
		this.put("IFCMONTHINYEARNUMBER", new IfcMonthInYearNumberBuilder());
		this.put("IFCDYNAMICVISCOSITYMEASURE", new IfcDynamicViscosityMeasureBuilder());
		this.put("IFCSECTIONMODULUSMEASURE", new IfcSectionModulusMeasureBuilder());
		this.put("IFCHOURINDAY", new IfcHourInDayBuilder());
		this.put("IFCROTATIONALMASSMEASURE", new IfcRotationalMassMeasureBuilder());
		this.put("IFCBOOLEANOPERATOR", new IfcBooleanOperatorBuilder());
		this.put("IFCELECTRICHEATERTYPEENUM", new IfcElectricHeaterTypeEnumBuilder());
		this.put("IFCOBJECTTYPEENUM", new IfcObjectTypeEnumBuilder());
		this.put("IFCINTERNALOREXTERNALENUM", new IfcInternalOrExternalEnumBuilder());
		this.put("IFCANGULARVELOCITYMEASURE", new IfcAngularVelocityMeasureBuilder());
		this.put("IFCFANTYPEENUM", new IfcFanTypeEnumBuilder());
		this.put("IFCLOGICALOPERATORENUM", new IfcLogicalOperatorEnumBuilder());
		this.put("IFCADDRESSTYPEENUM", new IfcAddressTypeEnumBuilder());
		this.put("IFCDISTRIBUTIONCHAMBERELEMENTTYPEENUM", new IfcDistributionChamberElementTypeEnumBuilder());
		this.put("IFCSOUNDSCALEENUM", new IfcSoundScaleEnumBuilder());
		this.put("IFCGEOMETRICPROJECTIONENUM", new IfcGeometricProjectionEnumBuilder());
		this.put("IFCSTAIRTYPEENUM", new IfcStairTypeEnumBuilder());
		this.put("IFCDUCTFITTINGTYPEENUM", new IfcDuctFittingTypeEnumBuilder());
		this.put("IFCLINEARVELOCITYMEASURE", new IfcLinearVelocityMeasureBuilder());
		this.put("IFCCOOLEDBEAMTYPEENUM", new IfcCooledBeamTypeEnumBuilder());
		this.put("IFCDESCRIPTIVEMEASURE", new IfcDescriptiveMeasureBuilder());
		this.put("IFCELECTRICAPPLIANCETYPEENUM", new IfcElectricApplianceTypeEnumBuilder());
		this.put("IFCSLABTYPEENUM", new IfcSlabTypeEnumBuilder());
		this.put("IFCVOLUMEMEASURE", new IfcVolumeMeasureBuilder());
		this.put("IFCPROJECTEDORTRUELENGTHENUM", new IfcProjectedOrTrueLengthEnumBuilder());
		this.put("IFCAREAMEASURE", new IfcAreaMeasureBuilder());
		this.put("IFCINTEGER", new IfcIntegerBuilder());
		this.put("IFCMASSPERLENGTHMEASURE", new IfcMassPerLengthMeasureBuilder());
		this.put("IFCDUCTSEGMENTTYPEENUM", new IfcDuctSegmentTypeEnumBuilder());
		this.put("IFCELECTRICCURRENTENUM", new IfcElectricCurrentEnumBuilder());
		this.put("IFCIDENTIFIER", new IfcIdentifierBuilder());
		this.put("IFCLINEARSTIFFNESSMEASURE", new IfcLinearStiffnessMeasureBuilder());
		this.put("IFCTIMESERIESDATATYPEENUM", new IfcTimeSeriesDataTypeEnumBuilder());
		this.put("IFCLIGHTDISTRIBUTIONCURVEENUM", new IfcLightDistributionCurveEnumBuilder());
		this.put("IFCLOADGROUPTYPEENUM", new IfcLoadGroupTypeEnumBuilder());
		this.put("IFCSPACETYPEENUM", new IfcSpaceTypeEnumBuilder());
		this.put("IFCSOUNDPOWERMEASURE", new IfcSoundPowerMeasureBuilder());
		this.put("IFCSHEARMODULUSMEASURE", new IfcShearModulusMeasureBuilder());
		this.put("IFCFOOTINGTYPEENUM", new IfcFootingTypeEnumBuilder());
		this.put("IFCMOISTUREDIFFUSIVITYMEASURE", new IfcMoistureDiffusivityMeasureBuilder());
		this.put("IFCAIRTERMINALBOXTYPEENUM", new IfcAirTerminalBoxTypeEnumBuilder());
		this.put("IFCSTRUCTURALSURFACETYPEENUM", new IfcStructuralSurfaceTypeEnumBuilder());
		this.put("IFCSTRUCTURALCURVETYPEENUM", new IfcStructuralCurveTypeEnumBuilder());
		this.put("IFCLUMINOUSINTENSITYDISTRIBUTIONMEASURE", new IfcLuminousIntensityDistributionMeasureBuilder());
		this.put("IFCDOORSTYLEOPERATIONENUM", new IfcDoorStyleOperationEnumBuilder());
		this.put("IFCMODULUSOFLINEARSUBGRADEREACTIONMEASURE", new IfcModulusOfLinearSubgradeReactionMeasureBuilder());
		this.put("IFCSPACEHEATERTYPEENUM", new IfcSpaceHeaterTypeEnumBuilder());
		this.put("IFCPIPEFITTINGTYPEENUM", new IfcPipeFittingTypeEnumBuilder());
		this.put("IFCBOOLEAN", new IfcBooleanBuilder());
		this.put("IFCTHERMALLOADTYPEENUM", new IfcThermalLoadTypeEnumBuilder());
		this.put("IFCSWITCHINGDEVICETYPEENUM", new IfcSwitchingDeviceTypeEnumBuilder());
		this.put("IFCPROCEDURETYPEENUM", new IfcProcedureTypeEnumBuilder());
		this.put("IFCTANKTYPEENUM", new IfcTankTypeEnumBuilder());
		this.put("IFCSECTIONALAREAINTEGRALMEASURE", new IfcSectionalAreaIntegralMeasureBuilder());
		this.put("IFCBEAMTYPEENUM", new IfcBeamTypeEnumBuilder());
		this.put("IFCMOTORCONNECTIONTYPEENUM", new IfcMotorConnectionTypeEnumBuilder());
		this.put("IFCDAMPERTYPEENUM", new IfcDamperTypeEnumBuilder());
		this.put("IFCUNITARYEQUIPMENTTYPEENUM", new IfcUnitaryEquipmentTypeEnumBuilder());
		this.put("IFCREINFORCINGBARSURFACEENUM", new IfcReinforcingBarSurfaceEnumBuilder());
		this.put("IFCCABLECARRIERSEGMENTTYPEENUM", new IfcCableCarrierSegmentTypeEnumBuilder());
		this.put("IFCPILECONSTRUCTIONENUM", new IfcPileConstructionEnumBuilder());
		this.put("IFCDIMENSIONCOUNT", new IfcDimensionCountBuilder());
		this.put("IFCCABLECARRIERFITTINGTYPEENUM", new IfcCableCarrierFittingTypeEnumBuilder());
		this.put("IFCPERMEABLECOVERINGOPERATIONENUM", new IfcPermeableCoveringOperationEnumBuilder());
		this.put("IFCDERIVEDUNITENUM", new IfcDerivedUnitEnumBuilder());
		this.put("IFCMOLECULARWEIGHTMEASURE", new IfcMolecularWeightMeasureBuilder());
		this.put("IFCENERGYMEASURE", new IfcEnergyMeasureBuilder());
		this.put("IFCPIPESEGMENTTYPEENUM", new IfcPipeSegmentTypeEnumBuilder());
		this.put("IFCGLOBALLYUNIQUEID", new IfcGloballyUniqueIdBuilder());
		this.put("IFCTEXTALIGNMENT", new IfcTextAlignmentBuilder());
		this.put("IFCTHERMALADMITTANCEMEASURE", new IfcThermalAdmittanceMeasureBuilder());
		this.put("IFCISOTHERMALMOISTURECAPACITYMEASURE", new IfcIsothermalMoistureCapacityMeasureBuilder());
		this.put("IFCAIRTERMINALTYPEENUM", new IfcAirTerminalTypeEnumBuilder());
		this.put("IFCHEATEXCHANGERTYPEENUM", new IfcHeatExchangerTypeEnumBuilder());
		this.put("IFCINDUCTANCEMEASURE", new IfcInductanceMeasureBuilder());
		this.put("IFCNUMERICMEASURE", new IfcNumericMeasureBuilder());
		this.put("IFCCONSTRAINTENUM", new IfcConstraintEnumBuilder());
		this.put("IFCFLOWDIRECTIONENUM", new IfcFlowDirectionEnumBuilder());
		this.put("IFCAMOUNTOFSUBSTANCEMEASURE", new IfcAmountOfSubstanceMeasureBuilder());
		this.put("IFCPOWERMEASURE", new IfcPowerMeasureBuilder());
		this.put("IFCCOILTYPEENUM", new IfcCoilTypeEnumBuilder());
		this.put("IFCPROTECTIVEDEVICETYPEENUM", new IfcProtectiveDeviceTypeEnumBuilder());
		this.put("IFCNULLSTYLE", new IfcNullStyleBuilder());
		this.put("IFCANALYSISMODELTYPEENUM", new IfcAnalysisModelTypeEnumBuilder());
		this.put("IFCSENSORTYPEENUM", new IfcSensorTypeEnumBuilder());
		this.put("IFCALARMTYPEENUM", new IfcAlarmTypeEnumBuilder());
		this.put("IFCOUTLETTYPEENUM", new IfcOutletTypeEnumBuilder());
		this.put("IFCRESOURCECONSUMPTIONENUM", new IfcResourceConsumptionEnumBuilder());
		this.put("IFCDOSEEQUIVALENTMEASURE", new IfcDoseEquivalentMeasureBuilder());
		this.put("IFCHEATINGVALUEMEASURE", new IfcHeatingValueMeasureBuilder());
		this.put("IFCINVENTORYTYPEENUM", new IfcInventoryTypeEnumBuilder());
		this.put("IFCCOVERINGTYPEENUM", new IfcCoveringTypeEnumBuilder());
		this.put("IFCRAILINGTYPEENUM", new IfcRailingTypeEnumBuilder());
		this.put("IFCREINFORCINGBARROLEENUM", new IfcReinforcingBarRoleEnumBuilder());
		this.put("IFCWARPINGCONSTANTMEASURE", new IfcWarpingConstantMeasureBuilder());
		this.put("IFCVALVETYPEENUM", new IfcValveTypeEnumBuilder());
		this.put("IFCPRESENTABLETEXT", new IfcPresentableTextBuilder());
		this.put("IFCTRANSPORTELEMENTTYPEENUM", new IfcTransportElementTypeEnumBuilder());
		this.put("IFCBOXALIGNMENT", new IfcBoxAlignmentBuilder());
		this.put("IFCSTACKTERMINALTYPEENUM", new IfcStackTerminalTypeEnumBuilder());
		this.put("IFCCOMPRESSORTYPEENUM", new IfcCompressorTypeEnumBuilder());
		this.put("IFCRAMPTYPEENUM", new IfcRampTypeEnumBuilder());
		this.put("IFCROOFTYPEENUM", new IfcRoofTypeEnumBuilder());
		this.put("IFCLINEARMOMENTMEASURE", new IfcLinearMomentMeasureBuilder());
		this.put("IFCPOSITIVEPLANEANGLEMEASURE", new IfcPositivePlaneAngleMeasureBuilder());
		this.put("IFCVIBRATIONISOLATORTYPEENUM", new IfcVibrationIsolatorTypeEnumBuilder());
		this.put("IFCAHEADORBEHIND", new IfcAheadOrBehindBuilder());
		this.put("IFCSECONDINMINUTE", new IfcSecondInMinuteBuilder());
		this.put("IFCPARAMETERVALUE", new IfcParameterValueBuilder());
		this.put("IFCELECTRICVOLTAGEMEASURE", new IfcElectricVoltageMeasureBuilder());
		this.put("IFCWINDOWPANELPOSITIONENUM", new IfcWindowPanelPositionEnumBuilder());
		this.put("IFCPLANARFORCEMEASURE", new IfcPlanarForceMeasureBuilder());
		this.put("IFCTHERMALEXPANSIONCOEFFICIENTMEASURE", new IfcThermalExpansionCoefficientMeasureBuilder());
		this.put("IFCLOGICAL", new IfcLogicalBuilder());
		this.put("IFCABSORBEDDOSEMEASURE", new IfcAbsorbedDoseMeasureBuilder());
		this.put("IFCCOLUMNTYPEENUM", new IfcColumnTypeEnumBuilder());
		this.put("IFCCOSTSCHEDULETYPEENUM", new IfcCostScheduleTypeEnumBuilder());
		this.put("IFCMODULUSOFELASTICITYMEASURE", new IfcModulusOfElasticityMeasureBuilder());
		this.put("IFCRIBPLATEDIRECTIONENUM", new IfcRibPlateDirectionEnumBuilder());
		this.put("IFCAIRTOAIRHEATRECOVERYTYPEENUM", new IfcAirToAirHeatRecoveryTypeEnumBuilder());
		this.put("IFCTHERMALTRANSMITTANCEMEASURE", new IfcThermalTransmittanceMeasureBuilder());
		this.put("IFCBOILERTYPEENUM", new IfcBoilerTypeEnumBuilder());
		this.put("IFCTEMPERATUREGRADIENTMEASURE", new IfcTemperatureGradientMeasureBuilder());
		this.put("IFCDOCUMENTCONFIDENTIALITYENUM", new IfcDocumentConfidentialityEnumBuilder());
		this.put("IFCELECTRICGENERATORTYPEENUM", new IfcElectricGeneratorTypeEnumBuilder());
		this.put("IFCMODULUSOFROTATIONALSUBGRADEREACTIONMEASURE", new IfcModulusOfRotationalSubgradeReactionMeasureBuilder());
		this.put("IFCOCCUPANTTYPEENUM", new IfcOccupantTypeEnumBuilder());
		this.put("IFCCONTEXTDEPENDENTMEASURE", new IfcContextDependentMeasureBuilder());
		this.put("IFCTEXTDECORATION", new IfcTextDecorationBuilder());
		this.put("IFCTRANSITIONCODE", new IfcTransitionCodeBuilder());
		this.put("IFCSTAIRFLIGHTTYPEENUM", new IfcStairFlightTypeEnumBuilder());
		this.put("IFCACTIONTYPEENUM", new IfcActionTypeEnumBuilder());
		this.put("IFCVAPORPERMEABILITYMEASURE", new IfcVaporPermeabilityMeasureBuilder());
		this.put("IFCLAYERSETDIRECTIONENUM", new IfcLayerSetDirectionEnumBuilder());
		this.put("IFCTENDONTYPEENUM", new IfcTendonTypeEnumBuilder());
		this.put("IFCCHILLERTYPEENUM", new IfcChillerTypeEnumBuilder());
		this.put("IFCSIUNIT", new IfcSIUnitBuilder());
		this.put("IFCRELASSIGNSTOACTOR", new IfcRelAssignsToActorBuilder());
		this.put("IFCDRAUGHTINGPREDEFINEDTEXTFONT", new IfcDraughtingPreDefinedTextFontBuilder());
		this.put("IFCDIRECTION", new IfcDirectionBuilder());
		this.put("IFCJUNCTIONBOXTYPE", new IfcJunctionBoxTypeBuilder());
		this.put("IFCFIRESUPPRESSIONTERMINALTYPE", new IfcFireSuppressionTerminalTypeBuilder());
		this.put("IFCRIGHTCIRCULARCONE", new IfcRightCircularConeBuilder());
		this.put("IFCREINFORCINGBAR", new IfcReinforcingBarBuilder());
		this.put("IFCCOORDINATEDUNIVERSALTIMEOFFSET", new IfcCoordinatedUniversalTimeOffsetBuilder());
		this.put("IFCFLOWSTORAGEDEVICE", new IfcFlowStorageDeviceBuilder());
		this.put("IFCDUCTSEGMENTTYPE", new IfcDuctSegmentTypeBuilder());
		this.put("IFCSTRUCTURALSURFACEMEMBER", new IfcStructuralSurfaceMemberBuilder());
		this.put("IFCTYPEOBJECT", new IfcTypeObjectBuilder());
		this.put("IFCFACETEDBREPWITHVOIDS", new IfcFacetedBrepWithVoidsBuilder());
		this.put("IFCMATERIALLAYER", new IfcMaterialLayerBuilder());
		this.put("IFCFACESURFACE", new IfcFaceSurfaceBuilder());
		this.put("IFCCIRCLEPROFILEDEF", new IfcCircleProfileDefBuilder());
		this.put("IFCRELASSOCIATESPROFILEPROPERTIES", new IfcRelAssociatesProfilePropertiesBuilder());
		this.put("IFCFANTYPE", new IfcFanTypeBuilder());
		this.put("IFCGEOMETRICCURVESET", new IfcGeometricCurveSetBuilder());
		this.put("IFCEVAPORATIVECOOLERTYPE", new IfcEvaporativeCoolerTypeBuilder());
		this.put("IFCORDERACTION", new IfcOrderActionBuilder());
		this.put("FILE_DESCRIPTION", new File_DescriptionBuilder());
		this.put("IFCRATIONALBEZIERCURVE", new IfcRationalBezierCurveBuilder());
		this.put("IFCFLOWFITTING", new IfcFlowFittingBuilder());
		this.put("IFCELLIPSE", new IfcEllipseBuilder());
		this.put("IFCWATERPROPERTIES", new IfcWaterPropertiesBuilder());
		this.put("IFCPIPEFITTINGTYPE", new IfcPipeFittingTypeBuilder());
		this.put("IFCENERGYCONVERSIONDEVICE", new IfcEnergyConversionDeviceBuilder());
		this.put("IFCPOLYGONALBOUNDEDHALFSPACE", new IfcPolygonalBoundedHalfSpaceBuilder());
		this.put("IFCSECTIONEDSPINE", new IfcSectionedSpineBuilder());
		this.put("IFCVIRTUALGRIDINTERSECTION", new IfcVirtualGridIntersectionBuilder());
		this.put("IFCGROUP", new IfcGroupBuilder());
		this.put("IFCLIGHTSOURCEDIRECTIONAL", new IfcLightSourceDirectionalBuilder());
		this.put("IFCPOLYLOOP", new IfcPolyLoopBuilder());
		this.put("IFCACTIONREQUEST", new IfcActionRequestBuilder());
		this.put("IFCRELASSIGNSTORESOURCE", new IfcRelAssignsToResourceBuilder());
		this.put("IFCRECTANGULARTRIMMEDSURFACE", new IfcRectangularTrimmedSurfaceBuilder());
		this.put("IFCDRAUGHTINGPREDEFINEDCOLOUR", new IfcDraughtingPreDefinedColourBuilder());
		this.put("IFCLOCALTIME", new IfcLocalTimeBuilder());
		this.put("IFCEDGELOOP", new IfcEdgeLoopBuilder());
		this.put("IFCSURFACESTYLESHADING", new IfcSurfaceStyleShadingBuilder());
		this.put("IFCDIMENSIONCURVETERMINATOR", new IfcDimensionCurveTerminatorBuilder());
		this.put("IFCCONNECTIONPOINTECCENTRICITY", new IfcConnectionPointEccentricityBuilder());
		this.put("IFCCOMPLEXPROPERTY", new IfcComplexPropertyBuilder());
		this.put("IFCCONSTRAINTCLASSIFICATIONRELATIONSHIP", new IfcConstraintClassificationRelationshipBuilder());
		this.put("IFCORGANIZATION", new IfcOrganizationBuilder());
		this.put("IFCQUANTITYTIME", new IfcQuantityTimeBuilder());
		this.put("IFCAPPLICATION", new IfcApplicationBuilder());
		this.put("IFCOPENSHELL", new IfcOpenShellBuilder());
		this.put("IFCTIMESERIESVALUE", new IfcTimeSeriesValueBuilder());
		this.put("IFCHEATEXCHANGERTYPE", new IfcHeatExchangerTypeBuilder());
		this.put("IFCHYGROSCOPICMATERIALPROPERTIES", new IfcHygroscopicMaterialPropertiesBuilder());
		this.put("IFCRELCONNECTSWITHECCENTRICITY", new IfcRelConnectsWithEccentricityBuilder());
		this.put("IFCCOLUMNTYPE", new IfcColumnTypeBuilder());
		this.put("IFCPRODUCTDEFINITIONSHAPE", new IfcProductDefinitionShapeBuilder());
		this.put("IFCBLOBTEXTURE", new IfcBlobTextureBuilder());
		this.put("IFCSTRUCTURALSTEELPROFILEPROPERTIES", new IfcStructuralSteelProfilePropertiesBuilder());
		this.put("IFCACTORROLE", new IfcActorRoleBuilder());
		this.put("IFCTABLEROW", new IfcTableRowBuilder());
		this.put("IFCVERTEXPOINT", new IfcVertexPointBuilder());
		this.put("IFCPRESENTATIONSTYLEASSIGNMENT", new IfcPresentationStyleAssignmentBuilder());
		this.put("IFCCURVESTYLEFONT", new IfcCurveStyleFontBuilder());
		this.put("IFCMAPPEDITEM", new IfcMappedItemBuilder());
		this.put("IFCCONSTRUCTIONPRODUCTRESOURCE", new IfcConstructionProductResourceBuilder());
		this.put("IFCPLANAREXTENT", new IfcPlanarExtentBuilder());
		this.put("IFCDIMENSIONCURVE", new IfcDimensionCurveBuilder());
		this.put("IFCMEMBER", new IfcMemberBuilder());
		this.put("IFCDAMPERTYPE", new IfcDamperTypeBuilder());
		this.put("IFCLSHAPEPROFILEDEF", new IfcLShapeProfileDefBuilder());
		this.put("IFCRELSPACEBOUNDARY", new IfcRelSpaceBoundaryBuilder());
		this.put("IFCTEXTSTYLEFORDEFINEDFONT", new IfcTextStyleForDefinedFontBuilder());
		this.put("IFCMATERIALLAYERSET", new IfcMaterialLayerSetBuilder());
		this.put("IFCELECTRICDISTRIBUTIONPOINT", new IfcElectricDistributionPointBuilder());
		this.put("IFCMATERIALCLASSIFICATIONRELATIONSHIP", new IfcMaterialClassificationRelationshipBuilder());
		this.put("IFCCONDENSERTYPE", new IfcCondenserTypeBuilder());
		this.put("IFCCHILLERTYPE", new IfcChillerTypeBuilder());
		this.put("IFCMATERIALLAYERSETUSAGE", new IfcMaterialLayerSetUsageBuilder());
		this.put("IFCIMAGETEXTURE", new IfcImageTextureBuilder());
		this.put("IFCVIRTUALELEMENT", new IfcVirtualElementBuilder());
		this.put("IFCSURFACESTYLEWITHTEXTURES", new IfcSurfaceStyleWithTexturesBuilder());
		this.put("IFCACTOR", new IfcActorBuilder());
		this.put("IFCRELCONTAINEDINSPATIALSTRUCTURE", new IfcRelContainedInSpatialStructureBuilder());
		this.put("IFCCIRCLEHOLLOWPROFILEDEF", new IfcCircleHollowProfileDefBuilder());
		this.put("IFCTERMINATORSYMBOL", new IfcTerminatorSymbolBuilder());
		this.put("IFCCONSTRUCTIONEQUIPMENTRESOURCE", new IfcConstructionEquipmentResourceBuilder());
		this.put("IFCPERMIT", new IfcPermitBuilder());
		this.put("IFCSTYLEDITEM", new IfcStyledItemBuilder());
		this.put("IFCORGANIZATIONRELATIONSHIP", new IfcOrganizationRelationshipBuilder());
		this.put("IFCDOCUMENTELECTRONICFORMAT", new IfcDocumentElectronicFormatBuilder());
		this.put("IFCALARMTYPE", new IfcAlarmTypeBuilder());
		this.put("IFCRELASSIGNSTOPRODUCT", new IfcRelAssignsToProductBuilder());
		this.put("IFCPROPERTYENUMERATION", new IfcPropertyEnumerationBuilder());
		this.put("IFCDISCRETEACCESSORYTYPE", new IfcDiscreteAccessoryTypeBuilder());
		this.put("IFCFACE", new IfcFaceBuilder());
		this.put("IFCRELASSIGNSTOGROUP", new IfcRelAssignsToGroupBuilder());
		this.put("IFCTUBEBUNDLETYPE", new IfcTubeBundleTypeBuilder());
		this.put("IFCASSET", new IfcAssetBuilder());
		this.put("IFCSURFACESTYLERENDERING", new IfcSurfaceStyleRenderingBuilder());
		this.put("IFCPROCEDURE", new IfcProcedureBuilder());
		this.put("IFCCURRENCYRELATIONSHIP", new IfcCurrencyRelationshipBuilder());
		this.put("IFCDOOR", new IfcDoorBuilder());
		this.put("IFCVERTEXBASEDTEXTUREMAP", new IfcVertexBasedTextureMapBuilder());
		this.put("IFCSPACETYPE", new IfcSpaceTypeBuilder());
		this.put("IFCMECHANICALMATERIALPROPERTIES", new IfcMechanicalMaterialPropertiesBuilder());
		this.put("IFCPOINTONCURVE", new IfcPointOnCurveBuilder());
		this.put("IFCCONDITION", new IfcConditionBuilder());
		this.put("IFCSTRUCTURALPOINTACTION", new IfcStructuralPointActionBuilder());
		this.put("IFCRELCONNECTSSTRUCTURALMEMBER", new IfcRelConnectsStructuralMemberBuilder());
		this.put("IFCANNOTATIONFILLAREAOCCURRENCE", new IfcAnnotationFillAreaOccurrenceBuilder());
		this.put("IFCFACEBASEDSURFACEMODEL", new IfcFaceBasedSurfaceModelBuilder());
		this.put("IFCRAMPFLIGHT", new IfcRampFlightBuilder());
		this.put("IFCOWNERHISTORY", new IfcOwnerHistoryBuilder());
		this.put("IFCDOCUMENTINFORMATIONRELATIONSHIP", new IfcDocumentInformationRelationshipBuilder());
		this.put("FILE_NAME", new File_NameBuilder());
		this.put("IFCRAMPFLIGHTTYPE", new IfcRampFlightTypeBuilder());
		this.put("IFCDIMENSIONALEXPONENTS", new IfcDimensionalExponentsBuilder());
		this.put("IFCRELVOIDSELEMENT", new IfcRelVoidsElementBuilder());
		this.put("IFCDERIVEDUNIT", new IfcDerivedUnitBuilder());
		this.put("IFCSTRUCTURALCURVEMEMBERVARYING", new IfcStructuralCurveMemberVaryingBuilder());
		this.put("IFCRELASSOCIATESAPPLIEDVALUE", new IfcRelAssociatesAppliedValueBuilder());
		this.put("IFCPROJECTORDERRECORD", new IfcProjectOrderRecordBuilder());
		this.put("IFCSERVICELIFE", new IfcServiceLifeBuilder());
		this.put("IFCQUANTITYWEIGHT", new IfcQuantityWeightBuilder());
		this.put("IFCCURVESTYLEFONTANDSCALING", new IfcCurveStyleFontAndScalingBuilder());
		this.put("IFCPROPERTYREFERENCEVALUE", new IfcPropertyReferenceValueBuilder());
		this.put("IFCELEMENTASSEMBLY", new IfcElementAssemblyBuilder());
		this.put("IFCFACEOUTERBOUND", new IfcFaceOuterBoundBuilder());
		this.put("IFCPREDEFINEDPOINTMARKERSYMBOL", new IfcPreDefinedPointMarkerSymbolBuilder());
		this.put("IFCOPENINGELEMENT", new IfcOpeningElementBuilder());
		this.put("IFCLIGHTSOURCEPOSITIONAL", new IfcLightSourcePositionalBuilder());
		this.put("IFCRELDEFINESBYTYPE", new IfcRelDefinesByTypeBuilder());
		this.put("IFCSUBCONTRACTRESOURCE", new IfcSubContractResourceBuilder());
		this.put("IFCCLASSIFICATIONITEM", new IfcClassificationItemBuilder());
		this.put("IFCOCCUPANT", new IfcOccupantBuilder());
		this.put("IFCSURFACESTYLE", new IfcSurfaceStyleBuilder());
		this.put("IFCLABORRESOURCE", new IfcLaborResourceBuilder());
		this.put("IFCRELASSOCIATESCONSTRAINT", new IfcRelAssociatesConstraintBuilder());
		this.put("IFCTEXTSTYLEWITHBOXCHARACTERISTICS", new IfcTextStyleWithBoxCharacteristicsBuilder());
		this.put("IFCCOSTITEM", new IfcCostItemBuilder());
		this.put("IFCFURNISHINGELEMENTTYPE", new IfcFurnishingElementTypeBuilder());
		this.put("IFCSPHERE", new IfcSphereBuilder());
		this.put("IFCBUILDINGELEMENTPROXY", new IfcBuildingElementProxyBuilder());
		this.put("IFCRELASSIGNSTASKS", new IfcRelAssignsTasksBuilder());
		this.put("IFCEQUIPMENTSTANDARD", new IfcEquipmentStandardBuilder());
		this.put("IFCBOUNDINGBOX", new IfcBoundingBoxBuilder());
		this.put("IFCLIBRARYINFORMATION", new IfcLibraryInformationBuilder());
		this.put("IFCVERTEXLOOP", new IfcVertexLoopBuilder());
		this.put("IFCRADIUSDIMENSION", new IfcRadiusDimensionBuilder());
		this.put("IFCPROPERTYCONSTRAINTRELATIONSHIP", new IfcPropertyConstraintRelationshipBuilder());
		this.put("IFCBOXEDHALFSPACE", new IfcBoxedHalfSpaceBuilder());
		this.put("IFCLIGHTSOURCEGONIOMETRIC", new IfcLightSourceGoniometricBuilder());
		this.put("IFCTENDONANCHOR", new IfcTendonAnchorBuilder());
		this.put("IFCCONTROLLERTYPE", new IfcControllerTypeBuilder());
		this.put("IFCTRANSFORMERTYPE", new IfcTransformerTypeBuilder());
		this.put("IFCPREDEFINEDDIMENSIONSYMBOL", new IfcPreDefinedDimensionSymbolBuilder());
		this.put("IFCCSHAPEPROFILEDEF", new IfcCShapeProfileDefBuilder());
		this.put("IFCTEXTUREMAP", new IfcTextureMapBuilder());
		this.put("IFCFUELPROPERTIES", new IfcFuelPropertiesBuilder());
		this.put("IFCCABLECARRIERSEGMENTTYPE", new IfcCableCarrierSegmentTypeBuilder());
		this.put("IFCSPACETHERMALLOADPROPERTIES", new IfcSpaceThermalLoadPropertiesBuilder());
		this.put("IFCRELASSIGNSTOCONTROL", new IfcRelAssignsToControlBuilder());
		this.put("IFCELECTRICALBASEPROPERTIES", new IfcElectricalBasePropertiesBuilder());
		this.put("IFCTASK", new IfcTaskBuilder());
		this.put("IFCSUBEDGE", new IfcSubedgeBuilder());
		this.put("IFCDISTRIBUTIONCHAMBERELEMENTTYPE", new IfcDistributionChamberElementTypeBuilder());
		this.put("IFCPLATE", new IfcPlateBuilder());
		this.put("IFCQUANTITYCOUNT", new IfcQuantityCountBuilder());
		this.put("IFCMOVE", new IfcMoveBuilder());
		this.put("IFCRELASSOCIATESAPPROVAL", new IfcRelAssociatesApprovalBuilder());
		this.put("IFCFLOWTREATMENTDEVICE", new IfcFlowTreatmentDeviceBuilder());
		this.put("IFCCOVERINGTYPE", new IfcCoveringTypeBuilder());
		this.put("IFCLINE", new IfcLineBuilder());
		this.put("IFCSTRUCTURALLOADPLANARFORCE", new IfcStructuralLoadPlanarForceBuilder());
		this.put("IFCSTAIRFLIGHT", new IfcStairFlightBuilder());
		this.put("IFCSANITARYTERMINALTYPE", new IfcSanitaryTerminalTypeBuilder());
		this.put("IFCRELCONNECTSSTRUCTURALELEMENT", new IfcRelConnectsStructuralElementBuilder());
		this.put("IFCLIGHTDISTRIBUTIONDATA", new IfcLightDistributionDataBuilder());
		this.put("IFCWASTETERMINALTYPE", new IfcWasteTerminalTypeBuilder());
		this.put("IFCSLAB", new IfcSlabBuilder());
		this.put("IFCFILLAREASTYLETILES", new IfcFillAreaStyleTilesBuilder());
		this.put("IFCEQUIPMENTELEMENT", new IfcEquipmentElementBuilder());
		this.put("IFCDUCTFITTINGTYPE", new IfcDuctFittingTypeBuilder());
		this.put("IFCSURFACESTYLELIGHTING", new IfcSurfaceStyleLightingBuilder());
		this.put("IFCSITE", new IfcSiteBuilder());
		this.put("IFCTRIMMEDCURVE", new IfcTrimmedCurveBuilder());
		this.put("IFCREPRESENTATIONCONTEXT", new IfcRepresentationContextBuilder());
		this.put("IFCCOLOURRGB", new IfcColourRgbBuilder());
		this.put("IFCRELASSOCIATESMATERIAL", new IfcRelAssociatesMaterialBuilder());
		this.put("IFCORIENTEDEDGE", new IfcOrientedEdgeBuilder());
		this.put("IFCELECTRICGENERATORTYPE", new IfcElectricGeneratorTypeBuilder());
		this.put("IFCRELASSOCIATESCLASSIFICATION", new IfcRelAssociatesClassificationBuilder());
		this.put("IFCDUCTSILENCERTYPE", new IfcDuctSilencerTypeBuilder());
		this.put("IFCDIMENSIONPAIR", new IfcDimensionPairBuilder());
		this.put("IFCENERGYPROPERTIES", new IfcEnergyPropertiesBuilder());
		this.put("IFCPILE", new IfcPileBuilder());
		this.put("IFCCRANERAILFSHAPEPROFILEDEF", new IfcCraneRailFShapeProfileDefBuilder());
		this.put("IFCMATERIAL", new IfcMaterialBuilder());
		this.put("IFCCIRCLE", new IfcCircleBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEFORCEWARPING", new IfcStructuralLoadSingleForceWarpingBuilder());
		this.put("IFCWALLSTANDARDCASE", new IfcWallStandardCaseBuilder());
		this.put("IFCARBITRARYPROFILEDEFWITHVOIDS", new IfcArbitraryProfileDefWithVoidsBuilder());
		this.put("IFCTEXTSTYLE", new IfcTextStyleBuilder());
		this.put("IFCMECHANICALSTEELMATERIALPROPERTIES", new IfcMechanicalSteelMaterialPropertiesBuilder());
		this.put("IFCBEAM", new IfcBeamBuilder());
		this.put("IFCOFFSETCURVE3D", new IfcOffsetCurve3DBuilder());
		this.put("IFCAPPROVAL", new IfcApprovalBuilder());
		this.put("IFCPRODUCTSOFCOMBUSTIONPROPERTIES", new IfcProductsOfCombustionPropertiesBuilder());
		this.put("IFCCURTAINWALL", new IfcCurtainWallBuilder());
		this.put("IFCDISTRIBUTIONELEMENTTYPE", new IfcDistributionElementTypeBuilder());
		this.put("IFCISHAPEPROFILEDEF", new IfcIShapeProfileDefBuilder());
		this.put("IFCARBITRARYOPENPROFILEDEF", new IfcArbitraryOpenProfileDefBuilder());
		this.put("IFCVALVETYPE", new IfcValveTypeBuilder());
		this.put("IFCEXTRUDEDAREASOLID", new IfcExtrudedAreaSolidBuilder());
		this.put("IFCACTUATORTYPE", new IfcActuatorTypeBuilder());
		this.put("IFCTEXTURECOORDINATEGENERATOR", new IfcTextureCoordinateGeneratorBuilder());
		this.put("IFCPROPERTYSET", new IfcPropertySetBuilder());
		this.put("IFCPROTECTIVEDEVICETYPE", new IfcProtectiveDeviceTypeBuilder());
		this.put("IFCCONTEXTDEPENDENTUNIT", new IfcContextDependentUnitBuilder());
		this.put("IFCCONSTRAINTRELATIONSHIP", new IfcConstraintRelationshipBuilder());
		this.put("IFCOFFSETCURVE2D", new IfcOffsetCurve2DBuilder());
		this.put("IFCBOUNDARYNODECONDITIONWARPING", new IfcBoundaryNodeConditionWarpingBuilder());
		this.put("IFCFURNITURESTANDARD", new IfcFurnitureStandardBuilder());
		this.put("IFCVERTEX", new IfcVertexBuilder());
		this.put("IFCREINFORCINGMESH", new IfcReinforcingMeshBuilder());
		this.put("IFCZONE", new IfcZoneBuilder());
		this.put("IFCRAMP", new IfcRampBuilder());
		this.put("IFCSTAIRFLIGHTTYPE", new IfcStairFlightTypeBuilder());
		this.put("IFCMEMBERTYPE", new IfcMemberTypeBuilder());
		this.put("IFCTEXTUREVERTEX", new IfcTextureVertexBuilder());
		this.put("IFCTANKTYPE", new IfcTankTypeBuilder());
		this.put("IFCCURVEBOUNDEDPLANE", new IfcCurveBoundedPlaneBuilder());
		this.put("IFCEDGE", new IfcEdgeBuilder());
		this.put("IFCANNOTATIONFILLAREA", new IfcAnnotationFillAreaBuilder());
		this.put("IFCSERVICELIFEFACTOR", new IfcServiceLifeFactorBuilder());
		this.put("IFCMEASUREWITHUNIT", new IfcMeasureWithUnitBuilder());
		this.put("IFCMONETARYUNIT", new IfcMonetaryUnitBuilder());
		this.put("IFCTEXTLITERALWITHEXTENT", new IfcTextLiteralWithExtentBuilder());
		this.put("IFCQUANTITYAREA", new IfcQuantityAreaBuilder());
		this.put("IFCUNITASSIGNMENT", new IfcUnitAssignmentBuilder());
		this.put("IFCRELSCHEDULESCOSTITEMS", new IfcRelSchedulesCostItemsBuilder());
		this.put("IFCVIBRATIONISOLATORTYPE", new IfcVibrationIsolatorTypeBuilder());
		this.put("IFCRELAGGREGATES", new IfcRelAggregatesBuilder());
		this.put("IFCSCHEDULETIMECONTROL", new IfcScheduleTimeControlBuilder());
		this.put("IFCCOMPOSITECURVE", new IfcCompositeCurveBuilder());
		this.put("IFCRELASSIGNSTOPROCESS", new IfcRelAssignsToProcessBuilder());
		this.put("IFCDRAUGHTINGCALLOUT", new IfcDraughtingCalloutBuilder());
		this.put("IFCRELCONNECTSELEMENTS", new IfcRelConnectsElementsBuilder());
		this.put("IFCTEXTSTYLEFONTMODEL", new IfcTextStyleFontModelBuilder());
		this.put("IFCPROPERTYENUMERATEDVALUE", new IfcPropertyEnumeratedValueBuilder());
		this.put("IFCCARTESIANPOINT", new IfcCartesianPointBuilder());
		this.put("IFCBUILDING", new IfcBuildingBuilder());
		this.put("IFCELLIPSEPROFILEDEF", new IfcEllipseProfileDefBuilder());
		this.put("IFCCONVERSIONBASEDUNIT", new IfcConversionBasedUnitBuilder());
		this.put("IFCSHELLBASEDSURFACEMODEL", new IfcShellBasedSurfaceModelBuilder());
		this.put("IFCANNOTATIONCURVEOCCURRENCE", new IfcAnnotationCurveOccurrenceBuilder());
		this.put("IFCAIRTERMINALBOXTYPE", new IfcAirTerminalBoxTypeBuilder());
		this.put("IFCSWITCHINGDEVICETYPE", new IfcSwitchingDeviceTypeBuilder());
		this.put("IFCPLATETYPE", new IfcPlateTypeBuilder());
		this.put("IFCPROJECTORDER", new IfcProjectOrderBuilder());
		this.put("IFCDOORSTYLE", new IfcDoorStyleBuilder());
		this.put("IFCEXTERNALLYDEFINEDSURFACESTYLE", new IfcExternallyDefinedSurfaceStyleBuilder());
		this.put("IFCSPACE", new IfcSpaceBuilder());
		this.put("IFCPLANE", new IfcPlaneBuilder());
		this.put("IFCSURFACESTYLEREFRACTION", new IfcSurfaceStyleRefractionBuilder());
		this.put("IFCBOUNDARYFACECONDITION", new IfcBoundaryFaceConditionBuilder());
		this.put("IFCFLOWSEGMENT", new IfcFlowSegmentBuilder());
		this.put("IFCTRANSPORTELEMENTTYPE", new IfcTransportElementTypeBuilder());
		this.put("IFCSURFACEOFLINEAREXTRUSION", new IfcSurfaceOfLinearExtrusionBuilder());
		this.put("IFCRECTANGLEHOLLOWPROFILEDEF", new IfcRectangleHollowProfileDefBuilder());
		this.put("IFCSTACKTERMINALTYPE", new IfcStackTerminalTypeBuilder());
		this.put("IFCDISTRIBUTIONELEMENT", new IfcDistributionElementBuilder());
		this.put("IFCLOCALPLACEMENT", new IfcLocalPlacementBuilder());
		this.put("IFCUNITARYEQUIPMENTTYPE", new IfcUnitaryEquipmentTypeBuilder());
		this.put("IFCBEZIERCURVE", new IfcBezierCurveBuilder());
		this.put("IFCEXTERNALLYDEFINEDTEXTFONT", new IfcExternallyDefinedTextFontBuilder());
		this.put("IFCFILTERTYPE", new IfcFilterTypeBuilder());
		this.put("IFCSTRUCTURALPOINTCONNECTION", new IfcStructuralPointConnectionBuilder());
		this.put("IFCDEFINEDSYMBOL", new IfcDefinedSymbolBuilder());
		this.put("IFCCOSTSCHEDULE", new IfcCostScheduleBuilder());
		this.put("IFCBOUNDARYNODECONDITION", new IfcBoundaryNodeConditionBuilder());
		this.put("IFCRAILING", new IfcRailingBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR3DNONUNIFORM", new IfcCartesianTransformationOperator3DnonUniformBuilder());
		this.put("IFCQUANTITYVOLUME", new IfcQuantityVolumeBuilder());
		this.put("IFCREPRESENTATIONMAP", new IfcRepresentationMapBuilder());
		this.put("IFCELECTRICMOTORTYPE", new IfcElectricMotorTypeBuilder());
		this.put("IFCLIGHTSOURCEAMBIENT", new IfcLightSourceAmbientBuilder());
		this.put("IFCTEXTLITERAL", new IfcTextLiteralBuilder());
		this.put("FILE_SCHEMA", new File_SchemaBuilder());
		this.put("IFCSTRUCTURALCURVECONNECTION", new IfcStructuralCurveConnectionBuilder());
		this.put("IFCELECTRICHEATERTYPE", new IfcElectricHeaterTypeBuilder());
		this.put("IFCELEMENTQUANTITY", new IfcElementQuantityBuilder());
		this.put("IFCREGULARTIMESERIES", new IfcRegularTimeSeriesBuilder());
		this.put("IFCGRIDAXIS", new IfcGridAxisBuilder());
		this.put("IFCCRANERAILASHAPEPROFILEDEF", new IfcCraneRailAShapeProfileDefBuilder());
		this.put("IFCTENDON", new IfcTendonBuilder());
		this.put("IFCROUNDEDEDGEFEATURE", new IfcRoundedEdgeFeatureBuilder());
		this.put("IFCWALLTYPE", new IfcWallTypeBuilder());
		this.put("IFCBOUNDEDSURFACE", new IfcBoundedSurfaceBuilder());
		this.put("IFCPERSON", new IfcPersonBuilder());
		this.put("IFCWORKPLAN", new IfcWorkPlanBuilder());
		this.put("IFCBOOLEANRESULT", new IfcBooleanResultBuilder());
		this.put("IFCFASTENERTYPE", new IfcFastenerTypeBuilder());
		this.put("IFCTELECOMADDRESS", new IfcTelecomAddressBuilder());
		this.put("IFCANNOTATIONTEXTOCCURRENCE", new IfcAnnotationTextOccurrenceBuilder());
		this.put("IFCPROPERTYTABLEVALUE", new IfcPropertyTableValueBuilder());
		this.put("IFCIRREGULARTIMESERIESVALUE", new IfcIrregularTimeSeriesValueBuilder());
		this.put("IFCDOCUMENTINFORMATION", new IfcDocumentInformationBuilder());
		this.put("IFCPIPESEGMENTTYPE", new IfcPipeSegmentTypeBuilder());
		this.put("IFCRELINTERACTIONREQUIREMENTS", new IfcRelInteractionRequirementsBuilder());
		this.put("IFCREINFORCEMENTBARPROPERTIES", new IfcReinforcementBarPropertiesBuilder());
		this.put("IFCCONDITIONCRITERION", new IfcConditionCriterionBuilder());
		this.put("IFCSTRUCTURALPLANARACTIONVARYING", new IfcStructuralPlanarActionVaryingBuilder());
		this.put("IFCARBITRARYCLOSEDPROFILEDEF", new IfcArbitraryClosedProfileDefBuilder());
		this.put("IFCCLASSIFICATIONREFERENCE", new IfcClassificationReferenceBuilder());
		this.put("IFCMOTORCONNECTIONTYPE", new IfcMotorConnectionTypeBuilder());
		this.put("IFCPERMEABLECOVERINGPROPERTIES", new IfcPermeableCoveringPropertiesBuilder());
		this.put("IFCWINDOW", new IfcWindowBuilder());
		this.put("IFCAXIS1PLACEMENT", new IfcAxis1PlacementBuilder());
		this.put("IFCDERIVEDUNITELEMENT", new IfcDerivedUnitElementBuilder());
		this.put("IFCRIBPLATEPROFILEPROPERTIES", new IfcRibPlateProfilePropertiesBuilder());
		this.put("IFCRELSERVICESBUILDINGS", new IfcRelServicesBuildingsBuilder());
		this.put("IFCBOUNDARYEDGECONDITION", new IfcBoundaryEdgeConditionBuilder());
		this.put("IFCENVIRONMENTALIMPACTVALUE", new IfcEnvironmentalImpactValueBuilder());
		this.put("IFCCSGSOLID", new IfcCsgSolidBuilder());
		this.put("IFCCABLESEGMENTTYPE", new IfcCableSegmentTypeBuilder());
		this.put("IFCAPPROVALACTORRELATIONSHIP", new IfcApprovalActorRelationshipBuilder());
		this.put("IFCFACETEDBREP", new IfcFacetedBrepBuilder());
		this.put("IFCCALENDARDATE", new IfcCalendarDateBuilder());
		this.put("IFCONEDIRECTIONREPEATFACTOR", new IfcOneDirectionRepeatFactorBuilder());
		this.put("IFCRELCONNECTSPORTTOELEMENT", new IfcRelConnectsPortToElementBuilder());
		this.put("IFCREINFORCEMENTDEFINITIONPROPERTIES", new IfcReinforcementDefinitionPropertiesBuilder());
		this.put("IFCDERIVEDPROFILEDEF", new IfcDerivedProfileDefBuilder());
		this.put("IFCRELCOVERSBLDGELEMENTS", new IfcRelCoversBldgElementsBuilder());
		this.put("IFCRELASSOCIATES", new IfcRelAssociatesBuilder());
		this.put("IFCCLASSIFICATIONNOTATION", new IfcClassificationNotationBuilder());
		this.put("IFCPRESENTATIONLAYERASSIGNMENT", new IfcPresentationLayerAssignmentBuilder());
		this.put("IFCSTRUCTURALCURVEMEMBER", new IfcStructuralCurveMemberBuilder());
		this.put("IFCCONSTRAINTAGGREGATIONRELATIONSHIP", new IfcConstraintAggregationRelationshipBuilder());
		this.put("IFCSTRUCTURALLOADLINEARFORCE", new IfcStructuralLoadLinearForceBuilder());
		this.put("IFCSOUNDVALUE", new IfcSoundValueBuilder());
		this.put("IFCRECTANGULARPYRAMID", new IfcRectangularPyramidBuilder());
		this.put("IFCRELDEFINESBYPROPERTIES", new IfcRelDefinesByPropertiesBuilder());
		this.put("IFCPIXELTEXTURE", new IfcPixelTextureBuilder());
		this.put("IFCTEXTSTYLETEXTMODEL", new IfcTextStyleTextModelBuilder());
		this.put("IFCSTAIR", new IfcStairBuilder());
		this.put("IFCSHAPEREPRESENTATION", new IfcShapeRepresentationBuilder());
		this.put("IFCEDGECURVE", new IfcEdgeCurveBuilder());
		this.put("IFCCONNECTIONCURVEGEOMETRY", new IfcConnectionCurveGeometryBuilder());
		this.put("IFCPERFORMANCEHISTORY", new IfcPerformanceHistoryBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEFORCE", new IfcStructuralLoadSingleForceBuilder());
		this.put("IFCMATERIALDEFINITIONREPRESENTATION", new IfcMaterialDefinitionRepresentationBuilder());
		this.put("IFCCOOLEDBEAMTYPE", new IfcCooledBeamTypeBuilder());
		this.put("IFCDIAMETERDIMENSION", new IfcDiameterDimensionBuilder());
		this.put("IFCTYPEPRODUCT", new IfcTypeProductBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEDISPLACEMENT", new IfcStructuralLoadSingleDisplacementBuilder());
		this.put("IFCWINDOWPANELPROPERTIES", new IfcWindowPanelPropertiesBuilder());
		this.put("IFCRAILINGTYPE", new IfcRailingTypeBuilder());
		this.put("IFCELECTRICTIMECONTROLTYPE", new IfcElectricTimeControlTypeBuilder());
		this.put("IFCPREDEFINEDTERMINATORSYMBOL", new IfcPreDefinedTerminatorSymbolBuilder());
		this.put("IFCGEOMETRICSET", new IfcGeometricSetBuilder());
		this.put("IFCTHERMALMATERIALPROPERTIES", new IfcThermalMaterialPropertiesBuilder());
		this.put("IFCAIRTOAIRHEATRECOVERYTYPE", new IfcAirToAirHeatRecoveryTypeBuilder());
		this.put("IFCEVAPORATORTYPE", new IfcEvaporatorTypeBuilder());
		this.put("IFCCLASSIFICATIONNOTATIONFACET", new IfcClassificationNotationFacetBuilder());
		this.put("IFCPROPERTYLISTVALUE", new IfcPropertyListValueBuilder());
		this.put("IFCDOORLININGPROPERTIES", new IfcDoorLiningPropertiesBuilder());
		this.put("IFCBOOLEANCLIPPINGRESULT", new IfcBooleanClippingResultBuilder());
		this.put("IFCCENTERLINEPROFILEDEF", new IfcCenterLineProfileDefBuilder());
		this.put("IFCDRAUGHTINGPREDEFINEDCURVEFONT", new IfcDraughtingPreDefinedCurveFontBuilder());
		this.put("IFCCOVERING", new IfcCoveringBuilder());
		this.put("IFCPROPERTYDEPENDENCYRELATIONSHIP", new IfcPropertyDependencyRelationshipBuilder());
		this.put("IFCAPPROVALRELATIONSHIP", new IfcApprovalRelationshipBuilder());
		this.put("IFCREFERENCESVALUEDOCUMENT", new IfcReferencesValueDocumentBuilder());
		this.put("IFCSTRUCTURALRESULTGROUP", new IfcStructuralResultGroupBuilder());
		this.put("IFCAPPLIEDVALUERELATIONSHIP", new IfcAppliedValueRelationshipBuilder());
		this.put("IFCFAILURECONNECTIONCONDITION", new IfcFailureConnectionConditionBuilder());
		this.put("IFCBEAMTYPE", new IfcBeamTypeBuilder());
		this.put("IFCCOLUMN", new IfcColumnBuilder());
		this.put("IFCRECTANGLEPROFILEDEF", new IfcRectangleProfileDefBuilder());
		this.put("IFCCURVESTYLEFONTPATTERN", new IfcCurveStyleFontPatternBuilder());
		this.put("IFCLIGHTINTENSITYDISTRIBUTION", new IfcLightIntensityDistributionBuilder());
		this.put("IFCPOINTONSURFACE", new IfcPointOnSurfaceBuilder());
		this.put("IFCSTRUCTURALSURFACECONNECTION", new IfcStructuralSurfaceConnectionBuilder());
		this.put("IFCSTRUCTURALPOINTREACTION", new IfcStructuralPointReactionBuilder());
		this.put("IFCLAMPTYPE", new IfcLampTypeBuilder());
		this.put("IFCSPACEHEATERTYPE", new IfcSpaceHeaterTypeBuilder());
		this.put("IFCSTYLEDREPRESENTATION", new IfcStyledRepresentationBuilder());
		this.put("IFCSTRUCTUREDDIMENSIONCALLOUT", new IfcStructuredDimensionCalloutBuilder());
		this.put("IFCANNOTATIONSYMBOLOCCURRENCE", new IfcAnnotationSymbolOccurrenceBuilder());
		this.put("IFCPATH", new IfcPathBuilder());
		this.put("IFCSTRUCTURALPROFILEPROPERTIES", new IfcStructuralProfilePropertiesBuilder());
		this.put("IFCELECTRICAPPLIANCETYPE", new IfcElectricApplianceTypeBuilder());
		this.put("IFCPOLYLINE", new IfcPolylineBuilder());
		this.put("IFCPROXY", new IfcProxyBuilder());
		this.put("IFCEXTERNALLYDEFINEDHATCHSTYLE", new IfcExternallyDefinedHatchStyleBuilder());
		this.put("IFCTWODIRECTIONREPEATFACTOR", new IfcTwoDirectionRepeatFactorBuilder());
		this.put("IFCSECTIONPROPERTIES", new IfcSectionPropertiesBuilder());
		this.put("IFCELECTRICFLOWSTORAGEDEVICETYPE", new IfcElectricFlowStorageDeviceTypeBuilder());
		this.put("IFCGASTERMINALTYPE", new IfcGasTerminalTypeBuilder());
		this.put("IFCGEOMETRICREPRESENTATIONSUBCONTEXT", new IfcGeometricRepresentationSubContextBuilder());
		this.put("IFCSTRUCTURALLOADSINGLEDISPLACEMENTDISTORTION", new IfcStructuralLoadSingleDisplacementDistortionBuilder());
		this.put("IFCBOILERTYPE", new IfcBoilerTypeBuilder());
		this.put("IFCFACEBOUND", new IfcFaceBoundBuilder());
		this.put("IFCRELREFERENCEDINSPATIALSTRUCTURE", new IfcRelReferencedInSpatialStructureBuilder());
		this.put("IFCSYSTEMFURNITUREELEMENTTYPE", new IfcSystemFurnitureElementTypeBuilder());
		this.put("IFCANNOTATION", new IfcAnnotationBuilder());
		this.put("IFCTRAPEZIUMPROFILEDEF", new IfcTrapeziumProfileDefBuilder());
		this.put("IFCFILLAREASTYLE", new IfcFillAreaStyleBuilder());
		this.put("IFCCONNECTIONPOINTGEOMETRY", new IfcConnectionPointGeometryBuilder());
		this.put("IFCRELASSOCIATESDOCUMENT", new IfcRelAssociatesDocumentBuilder());
		this.put("IFCPRESENTATIONLAYERWITHSTYLE", new IfcPresentationLayerWithStyleBuilder());
		this.put("IFCFLOWCONTROLLER", new IfcFlowControllerBuilder());
		this.put("IFCROOF", new IfcRoofBuilder());
		this.put("IFCVECTOR", new IfcVectorBuilder());
		this.put("IFCGENERALPROFILEPROPERTIES", new IfcGeneralProfilePropertiesBuilder());
		this.put("IFCHUMIDIFIERTYPE", new IfcHumidifierTypeBuilder());
		this.put("IFCWINDOWLININGPROPERTIES", new IfcWindowLiningPropertiesBuilder());
		this.put("IFCDISCRETEACCESSORY", new IfcDiscreteAccessoryBuilder());
		this.put("IFCBUILDINGELEMENTPROXYTYPE", new IfcBuildingElementProxyTypeBuilder());
		this.put("IFCHALFSPACESOLID", new IfcHalfSpaceSolidBuilder());
		this.put("IFCFURNISHINGELEMENT", new IfcFurnishingElementBuilder());
		this.put("IFCAIRTERMINALTYPE", new IfcAirTerminalTypeBuilder());
		this.put("IFCAPPROVALPROPERTYRELATIONSHIP", new IfcApprovalPropertyRelationshipBuilder());
		this.put("IFCMECHANICALCONCRETEMATERIALPROPERTIES", new IfcMechanicalConcreteMaterialPropertiesBuilder());
		this.put("IFCANGULARDIMENSION", new IfcAngularDimensionBuilder());
		this.put("IFCPUMPTYPE", new IfcPumpTypeBuilder());
		this.put("IFCLOOP", new IfcLoopBuilder());
		this.put("IFCFURNITURETYPE", new IfcFurnitureTypeBuilder());
		this.put("IFCPLANARBOX", new IfcPlanarBoxBuilder());
		this.put("IFCPOSTALADDRESS", new IfcPostalAddressBuilder());
		this.put("IFCOBJECTIVE", new IfcObjectiveBuilder());
		this.put("IFCREVOLVEDAREASOLID", new IfcRevolvedAreaSolidBuilder());
		this.put("IFCRELASSIGNSTOPROJECTORDER", new IfcRelAssignsToProjectOrderBuilder());
		this.put("IFCFLOWTERMINAL", new IfcFlowTerminalBuilder());
		this.put("IFCPROJECT", new IfcProjectBuilder());
		this.put("IFCWALL", new IfcWallBuilder());
		this.put("IFCRELPROJECTSELEMENT", new IfcRelProjectsElementBuilder());
		this.put("IFCDOCUMENTREFERENCE", new IfcDocumentReferenceBuilder());
		this.put("IFCRELASSOCIATESLIBRARY", new IfcRelAssociatesLibraryBuilder());
		this.put("IFCCOMPRESSORTYPE", new IfcCompressorTypeBuilder());
		this.put("IFCSPACEPROGRAM", new IfcSpaceProgramBuilder());
		this.put("IFCBUILDINGSTOREY", new IfcBuildingStoreyBuilder());
		this.put("IFCSWEPTDISKSOLID", new IfcSweptDiskSolidBuilder());
		this.put("IFCTIMESERIESREFERENCERELATIONSHIP", new IfcTimeSeriesReferenceRelationshipBuilder());
		this.put("IFC2DCOMPOSITECURVE", new Ifc2DCompositeCurveBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR2DNONUNIFORM", new IfcCartesianTransformationOperator2DnonUniformBuilder());
		this.put("IFCCHAMFEREDGEFEATURE", new IfcChamferEdgeFeatureBuilder());
		this.put("IFCPROJECTIONELEMENT", new IfcProjectionElementBuilder());
		this.put("IFCMECHANICALFASTENER", new IfcMechanicalFastenerBuilder());
		this.put("IFCTRANSPORTELEMENT", new IfcTransportElementBuilder());
		this.put("IFCTIMESERIESSCHEDULE", new IfcTimeSeriesScheduleBuilder());
		this.put("IFCRELSEQUENCE", new IfcRelSequenceBuilder());
		this.put("IFCFILLAREASTYLETILESYMBOLWITHSTYLE", new IfcFillAreaStyleTileSymbolWithStyleBuilder());
		this.put("IFCFLUIDFLOWPROPERTIES", new IfcFluidFlowPropertiesBuilder());
		this.put("IFCFOOTING", new IfcFootingBuilder());
		this.put("IFCPRODUCTREPRESENTATION", new IfcProductRepresentationBuilder());
		this.put("IFCCONNECTEDFACESET", new IfcConnectedFaceSetBuilder());
		this.put("IFCBUILDINGELEMENTPART", new IfcBuildingElementPartBuilder());
		this.put("IFCAXIS2PLACEMENT3D", new IfcAxis2Placement3DBuilder());
		this.put("IFCLIGHTSOURCESPOT", new IfcLightSourceSpotBuilder());
		this.put("IFCSTRUCTURALPLANARACTION", new IfcStructuralPlanarActionBuilder());
		this.put("IFCPROJECTIONCURVE", new IfcProjectionCurveBuilder());
		this.put("IFCLINEARDIMENSION", new IfcLinearDimensionBuilder());
		this.put("IFCCLASSIFICATION", new IfcClassificationBuilder());
		this.put("IFCFLOWMOVINGDEVICE", new IfcFlowMovingDeviceBuilder());
		this.put("IFCUSHAPEPROFILEDEF", new IfcUShapeProfileDefBuilder());
		this.put("IFCPERSONANDORGANIZATION", new IfcPersonAndOrganizationBuilder());
		this.put("IFCMETRIC", new IfcMetricBuilder());
		this.put("IFCLIGHTFIXTURETYPE", new IfcLightFixtureTypeBuilder());
		this.put("IFCSURFACEOFREVOLUTION", new IfcSurfaceOfRevolutionBuilder());
		this.put("IFCCABLECARRIERFITTINGTYPE", new IfcCableCarrierFittingTypeBuilder());
		this.put("IFCSTRUCTURALLOADTEMPERATURE", new IfcStructuralLoadTemperatureBuilder());
		this.put("IFCRIGHTCIRCULARCYLINDER", new IfcRightCircularCylinderBuilder());
		this.put("IFCCOSTVALUE", new IfcCostValueBuilder());
		this.put("IFCELECTRICALCIRCUIT", new IfcElectricalCircuitBuilder());
		this.put("IFCFILLAREASTYLEHATCHING", new IfcFillAreaStyleHatchingBuilder());
		this.put("IFCSHAPEASPECT", new IfcShapeAspectBuilder());
		this.put("IFCRELCONNECTSPATHELEMENTS", new IfcRelConnectsPathElementsBuilder());
		this.put("IFCCONSTRUCTIONMATERIALRESOURCE", new IfcConstructionMaterialResourceBuilder());
		this.put("IFCIRREGULARTIMESERIES", new IfcIrregularTimeSeriesBuilder());
		this.put("IFCSTRUCTURALLINEARACTION", new IfcStructuralLinearActionBuilder());
		this.put("IFCGENERALMATERIALPROPERTIES", new IfcGeneralMaterialPropertiesBuilder());
		this.put("IFCCOMPOSITECURVESEGMENT", new IfcCompositeCurveSegmentBuilder());
		this.put("IFCGRIDPLACEMENT", new IfcGridPlacementBuilder());
		this.put("IFCOPTICALMATERIALPROPERTIES", new IfcOpticalMaterialPropertiesBuilder());
		this.put("IFCDATEANDTIME", new IfcDateAndTimeBuilder());
		this.put("IFCSTRUCTURALLINEARACTIONVARYING", new IfcStructuralLinearActionVaryingBuilder());
		this.put("IFCEXTERNALLYDEFINEDSYMBOL", new IfcExternallyDefinedSymbolBuilder());
		this.put("IFCDISTRIBUTIONCONTROLELEMENT", new IfcDistributionControlElementBuilder());
		this.put("IFCINVENTORY", new IfcInventoryBuilder());
		this.put("IFCTSHAPEPROFILEDEF", new IfcTShapeProfileDefBuilder());
		this.put("IFCDOORPANELPROPERTIES", new IfcDoorPanelPropertiesBuilder());
		this.put("IFCDIMENSIONCALLOUTRELATIONSHIP", new IfcDimensionCalloutRelationshipBuilder());
		this.put("IFCGRID", new IfcGridBuilder());
		this.put("IFCDISTRIBUTIONCHAMBERELEMENT", new IfcDistributionChamberElementBuilder());
		this.put("IFCFLOWINSTRUMENTTYPE", new IfcFlowInstrumentTypeBuilder());
		this.put("IFCTOPOLOGYREPRESENTATION", new IfcTopologyRepresentationBuilder());
		this.put("IFCDISTRIBUTIONPORT", new IfcDistributionPortBuilder());
		this.put("IFCANNOTATIONSURFACEOCCURRENCE", new IfcAnnotationSurfaceOccurrenceBuilder());
		this.put("IFCCURVESTYLE", new IfcCurveStyleBuilder());
		this.put("IFCRELFLOWCONTROLELEMENTS", new IfcRelFlowControlElementsBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR3D", new IfcCartesianTransformationOperator3DBuilder());
		this.put("IFCSTRUCTURALSURFACEMEMBERVARYING", new IfcStructuralSurfaceMemberVaryingBuilder());
		this.put("IFCFASTENER", new IfcFastenerBuilder());
		this.put("IFCSTRUCTURALANALYSISMODEL", new IfcStructuralAnalysisModelBuilder());
		this.put("IFCLIBRARYREFERENCE", new IfcLibraryReferenceBuilder());
		this.put("IFCRELAXATION", new IfcRelaxationBuilder());
		this.put("IFCSOUNDPROPERTIES", new IfcSoundPropertiesBuilder());
		this.put("IFCCLOSEDSHELL", new IfcClosedShellBuilder());
		this.put("IFCRELFILLSELEMENT", new IfcRelFillsElementBuilder());
		this.put("IFCCURTAINWALLTYPE", new IfcCurtainWallTypeBuilder());
		this.put("IFCAXIS2PLACEMENT2D", new IfcAxis2Placement2DBuilder());
		this.put("IFCFLOWMETERTYPE", new IfcFlowMeterTypeBuilder());
		this.put("IFCWORKSCHEDULE", new IfcWorkScheduleBuilder());
		this.put("IFCCONNECTIONPORTGEOMETRY", new IfcConnectionPortGeometryBuilder());
		this.put("IFCCREWRESOURCE", new IfcCrewResourceBuilder());
		this.put("IFCSLABTYPE", new IfcSlabTypeBuilder());
		this.put("IFCRELCONNECTSSTRUCTURALACTIVITY", new IfcRelConnectsStructuralActivityBuilder());
		this.put("IFCCOOLINGTOWERTYPE", new IfcCoolingTowerTypeBuilder());
		this.put("IFCOUTLETTYPE", new IfcOutletTypeBuilder());
		this.put("IFCRELCOVERSSPACES", new IfcRelCoversSpacesBuilder());
		this.put("IFCRELCONNECTSWITHREALIZINGELEMENTS", new IfcRelConnectsWithRealizingElementsBuilder());
		this.put("IFCDRAUGHTINGCALLOUTRELATIONSHIP", new IfcDraughtingCalloutRelationshipBuilder());
		this.put("IFCSECTIONREINFORCEMENTPROPERTIES", new IfcSectionReinforcementPropertiesBuilder());
		this.put("IFCELECTRICALELEMENT", new IfcElectricalElementBuilder());
		this.put("IFCSYSTEM", new IfcSystemBuilder());
		this.put("IFCRELOVERRIDESPROPERTIES", new IfcRelOverridesPropertiesBuilder());
		this.put("IFCWINDOWSTYLE", new IfcWindowStyleBuilder());
		this.put("IFCSYMBOLSTYLE", new IfcSymbolStyleBuilder());
		this.put("IFCSENSORTYPE", new IfcSensorTypeBuilder());
		this.put("IFCSTRUCTURALLOADGROUP", new IfcStructuralLoadGroupBuilder());
		this.put("IFCMECHANICALFASTENERTYPE", new IfcMechanicalFastenerTypeBuilder());
		this.put("IFCCONNECTIONSURFACEGEOMETRY", new IfcConnectionSurfaceGeometryBuilder());
		this.put("IFCRELNESTS", new IfcRelNestsBuilder());
		this.put("IFCMATERIALLIST", new IfcMaterialListBuilder());
		this.put("IFCDISTRIBUTIONFLOWELEMENT", new IfcDistributionFlowElementBuilder());
		this.put("IFCTABLE", new IfcTableBuilder());
		this.put("IFCROUNDEDRECTANGLEPROFILEDEF", new IfcRoundedRectangleProfileDefBuilder());
		this.put("IFCANNOTATIONSURFACE", new IfcAnnotationSurfaceBuilder());
		this.put("IFCEXTENDEDMATERIALPROPERTIES", new IfcExtendedMaterialPropertiesBuilder());
		this.put("IFCCLASSIFICATIONITEMRELATIONSHIP", new IfcClassificationItemRelationshipBuilder());
		this.put("IFCPROPERTYBOUNDEDVALUE", new IfcPropertyBoundedValueBuilder());
		this.put("IFCCOMPOSITEPROFILEDEF", new IfcCompositeProfileDefBuilder());
		this.put("IFCGEOMETRICREPRESENTATIONCONTEXT", new IfcGeometricRepresentationContextBuilder());
		this.put("IFCASYMMETRICISHAPEPROFILEDEF", new IfcAsymmetricIShapeProfileDefBuilder());
		this.put("IFCRELCONNECTSPORTS", new IfcRelConnectsPortsBuilder());
		this.put("IFCQUANTITYLENGTH", new IfcQuantityLengthBuilder());
		this.put("IFCSLIPPAGECONNECTIONCONDITION", new IfcSlippageConnectionConditionBuilder());
		this.put("IFCREPRESENTATION", new IfcRepresentationBuilder());
		this.put("IFCRELOCCUPIESSPACES", new IfcRelOccupiesSpacesBuilder());
		this.put("IFCZSHAPEPROFILEDEF", new IfcZShapeProfileDefBuilder());
		this.put("IFCDIMENSIONCURVEDIRECTEDCALLOUT", new IfcDimensionCurveDirectedCalloutBuilder());
		this.put("IFCSURFACECURVESWEPTAREASOLID", new IfcSurfaceCurveSweptAreaSolidBuilder());
		this.put("IFCPROPERTYSINGLEVALUE", new IfcPropertySingleValueBuilder());
		this.put("IFCCOILTYPE", new IfcCoilTypeBuilder());
		this.put("IFCBLOCK", new IfcBlockBuilder());
		this.put("IFCCARTESIANTRANSFORMATIONOPERATOR2D", new IfcCartesianTransformationOperator2DBuilder());
		this.put("IFCPHYSICALCOMPLEXQUANTITY", new IfcPhysicalComplexQuantityBuilder());
		this.put("INTEGER", new INTEGERBuilder());
		this.put("DOUBLE", new DOUBLEBuilder());
		this.put("BOOLEAN", new BOOLEANBuilder());
		this.put("BINARY", new BINARYBuilder());
		this.put("REAL", new REALBuilder());
		this.put("STRING", new STRINGBuilder());
		this.put("LOGICAL", new LOGICALBuilder());
	}


static class IfcSequenceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSequenceEnum();}}

static class IfcWorkControlTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkControlTypeEnum();}}

static class IfcIntegerCountRateMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIntegerCountRateMeasure();}}

static class IfcProfileTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProfileTypeEnum();}}

static class IfcModulusOfSubgradeReactionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfSubgradeReactionMeasure();}}

static class IfcRatioMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRatioMeasure();}}

static class IfcArithmeticOperatorEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArithmeticOperatorEnum();}}

static class IfcServiceLifeFactorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcServiceLifeFactorTypeEnum();}}

static class IfcTrimmingPreferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTrimmingPreference();}}

static class IfcEnvironmentalImpactCategoryEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnvironmentalImpactCategoryEnum();}}

static class IfcPropertySourceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySourceEnum();}}

static class IfcDocumentStatusEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentStatusEnum();}}

static class IfcWindowStyleConstructionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowStyleConstructionEnum();}}

static class IfcStateEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStateEnum();}}

static class IfcPlateTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlateTypeEnum();}}

static class IfcCondenserTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCondenserTypeEnum();}}

static class IfcPhysicalOrVirtualEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPhysicalOrVirtualEnum();}}

static class IfcElectricChargeMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricChargeMeasure();}}

static class IfcMassFlowRateMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassFlowRateMeasure();}}

static class IfcPositiveLengthMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPositiveLengthMeasure();}}

static class IfcVolumetricFlowRateMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVolumetricFlowRateMeasure();}}

static class IfcCompoundPlaneAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompoundPlaneAngleMeasure();}}

static class IfcYearNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcYearNumber();}}

static class IfcElementCompositionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementCompositionEnum();}}

static class IfcJunctionBoxTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcJunctionBoxTypeEnum();}}

static class IfcCoolingTowerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoolingTowerTypeEnum();}}

static class IfcTimeStampBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeStamp();}}

static class IfcComplexNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcComplexNumber();}}

static class IfcSanitaryTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSanitaryTerminalTypeEnum();}}

static class IfcThermalResistanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalResistanceMeasure();}}

static class IfcTubeBundleTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTubeBundleTypeEnum();}}

static class IfcNormalisedRatioMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcNormalisedRatioMeasure();}}

static class IfcActionSourceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActionSourceTypeEnum();}}

static class IfcDaylightSavingHourBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDaylightSavingHour();}}

static class SchemaNameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new SchemaName();}}

static class IfcLuminousIntensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLuminousIntensityMeasure();}}

static class IfcElectricTimeControlTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricTimeControlTypeEnum();}}

static class IfcPumpTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPumpTypeEnum();}}

static class IfcRotationalStiffnessMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRotationalStiffnessMeasure();}}

static class IfcLinearForceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearForceMeasure();}}

static class IfcProjectOrderTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectOrderTypeEnum();}}

static class IfcTimeMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeMeasure();}}

static class IfcTextFontNameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextFontName();}}

static class IfcDimensionExtentUsageBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionExtentUsage();}}

static class TimeStampTextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new TimeStampText();}}

static class IfcObjectiveEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcObjectiveEnum();}}

static class IfcSpecularRoughnessBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpecularRoughness();}}

static class IfcElectricCapacitanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricCapacitanceMeasure();}}

static class IfcRadioActivityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRadioActivityMeasure();}}

static class IfcMagneticFluxMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMagneticFluxMeasure();}}

static class IfcMemberTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMemberTypeEnum();}}

static class IfcSolidAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSolidAngleMeasure();}}

static class IfcSIPrefixBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSIPrefix();}}

static class IfcGlobalOrLocalEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGlobalOrLocalEnum();}}

static class IfcActuatorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActuatorTypeEnum();}}

static class IfcRotationalFrequencyMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRotationalFrequencyMeasure();}}

static class IfcElementAssemblyTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementAssemblyTypeEnum();}}

static class IfcDayInMonthNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDayInMonthNumber();}}

static class IfcCurrencyEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurrencyEnum();}}

static class IfcPressureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPressureMeasure();}}

static class IfcEnergySequenceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnergySequenceEnum();}}

static class IfcGasTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGasTerminalTypeEnum();}}

static class IfcWallTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWallTypeEnum();}}

static class IfcBSplineCurveFormBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBSplineCurveForm();}}

static class IfcServiceLifeTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcServiceLifeTypeEnum();}}

static class IfcMinuteInHourBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMinuteInHour();}}

static class IfcProjectOrderRecordTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectOrderRecordTypeEnum();}}

static class IfcTextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcText();}}

static class IfcSurfaceSideBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceSide();}}

static class IfcControllerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcControllerTypeEnum();}}

static class IfcForceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcForceMeasure();}}

static class IfcFlowMeterTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowMeterTypeEnum();}}

static class IfcSoundPressureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundPressureMeasure();}}

static class IfcFontVariantBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFontVariant();}}

static class IfcAccelerationMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAccelerationMeasure();}}

static class IfcElectricDistributionPointFunctionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricDistributionPointFunctionEnum();}}

static class IfcFrequencyMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFrequencyMeasure();}}

static class IfcBenchmarkEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBenchmarkEnum();}}

static class IfcChangeActionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChangeActionEnum();}}

static class IfcCableSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableSegmentTypeEnum();}}

static class IfcMassDensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassDensityMeasure();}}

static class IfcLuminousFluxMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLuminousFluxMeasure();}}

static class IfcLabelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLabel();}}

static class IfcDuctSilencerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSilencerTypeEnum();}}

static class IfcDoorStyleConstructionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorStyleConstructionEnum();}}

static class IfcLampTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLampTypeEnum();}}

static class IfcFontWeightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFontWeight();}}

static class IfcRoleEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoleEnum();}}

static class IfcReflectanceMethodEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReflectanceMethodEnum();}}

static class IfcWindowPanelOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowPanelOperationEnum();}}

static class IfcSurfaceTextureEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceTextureEnum();}}

static class IfcElectricCurrentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricCurrentMeasure();}}

static class IfcAssemblyPlaceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAssemblyPlaceEnum();}}

static class IfcEvaporativeCoolerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporativeCoolerTypeEnum();}}

static class IfcSpecificHeatCapacityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpecificHeatCapacityMeasure();}}

static class IfcDataOriginEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDataOriginEnum();}}

static class IfcFilterTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFilterTypeEnum();}}

static class IfcPositiveRatioMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPositiveRatioMeasure();}}

static class IfcTextTransformationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextTransformation();}}

static class IfcDirectionSenseEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDirectionSenseEnum();}}

static class IfcTextPathBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextPath();}}

static class IfcMonetaryMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMonetaryMeasure();}}

static class IfcElectricFlowStorageDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricFlowStorageDeviceTypeEnum();}}

static class IfcTorqueMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTorqueMeasure();}}

static class IfcWindowStyleOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowStyleOperationEnum();}}

static class IfcIlluminanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIlluminanceMeasure();}}

static class IfcTransformerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransformerTypeEnum();}}

static class IfcAnalysisTheoryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnalysisTheoryTypeEnum();}}

static class IfcFlowInstrumentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowInstrumentTypeEnum();}}

static class IfcHumidifierTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHumidifierTypeEnum();}}

static class IfcMagneticFluxDensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMagneticFluxDensityMeasure();}}

static class IfcCurvatureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurvatureMeasure();}}

static class IfcKinematicViscosityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcKinematicViscosityMeasure();}}

static class IfcPHMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPHMeasure();}}

static class IfcHeatFluxDensityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatFluxDensityMeasure();}}

static class IfcConnectionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionTypeEnum();}}

static class IfcRampFlightTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampFlightTypeEnum();}}

static class IfcSpecularExponentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpecularExponent();}}

static class IfcMassMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassMeasure();}}

static class IfcThermalLoadSourceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalLoadSourceEnum();}}

static class IfcEvaporatorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporatorTypeEnum();}}

static class IfcSectionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionTypeEnum();}}

static class IfcDoorPanelPositionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorPanelPositionEnum();}}

static class IfcSIUnitNameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSIUnitName();}}

static class IfcWasteTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWasteTerminalTypeEnum();}}

static class IfcUnitEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitEnum();}}

static class IfcTimeSeriesScheduleTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeSeriesScheduleTypeEnum();}}

static class IfcLightEmissionSourceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightEmissionSourceEnum();}}

static class IfcElectricResistanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricResistanceMeasure();}}

static class IfcThermalConductivityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalConductivityMeasure();}}

static class IfcElectricMotorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricMotorTypeEnum();}}

static class IfcLightFixtureTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightFixtureTypeEnum();}}

static class IfcBuildingElementProxyTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementProxyTypeEnum();}}

static class IfcPileTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPileTypeEnum();}}

static class IfcThermodynamicTemperatureMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermodynamicTemperatureMeasure();}}

static class IfcDoorPanelOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorPanelOperationEnum();}}

static class IfcFontStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFontStyle();}}

static class IfcLengthMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLengthMeasure();}}

static class IfcMomentOfInertiaMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMomentOfInertiaMeasure();}}

static class IfcRealBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReal();}}

static class IfcCurtainWallTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurtainWallTypeEnum();}}

static class IfcWarpingMomentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWarpingMomentMeasure();}}

static class IfcCountMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCountMeasure();}}

static class IfcIonConcentrationMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIonConcentrationMeasure();}}

static class IfcPlaneAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlaneAngleMeasure();}}

static class IfcElectricConductanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricConductanceMeasure();}}

static class IfcFireSuppressionTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFireSuppressionTerminalTypeEnum();}}

static class IfcMonthInYearNumberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMonthInYearNumber();}}

static class IfcDynamicViscosityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDynamicViscosityMeasure();}}

static class IfcSectionModulusMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionModulusMeasure();}}

static class IfcHourInDayBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHourInDay();}}

static class IfcRotationalMassMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRotationalMassMeasure();}}

static class IfcBooleanOperatorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBooleanOperator();}}

static class IfcElectricHeaterTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricHeaterTypeEnum();}}

static class IfcObjectTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcObjectTypeEnum();}}

static class IfcInternalOrExternalEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInternalOrExternalEnum();}}

static class IfcAngularVelocityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAngularVelocityMeasure();}}

static class IfcFanTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFanTypeEnum();}}

static class IfcLogicalOperatorEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLogicalOperatorEnum();}}

static class IfcAddressTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAddressTypeEnum();}}

static class IfcDistributionChamberElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionChamberElementTypeEnum();}}

static class IfcSoundScaleEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundScaleEnum();}}

static class IfcGeometricProjectionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricProjectionEnum();}}

static class IfcStairTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairTypeEnum();}}

static class IfcDuctFittingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctFittingTypeEnum();}}

static class IfcLinearVelocityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearVelocityMeasure();}}

static class IfcCooledBeamTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCooledBeamTypeEnum();}}

static class IfcDescriptiveMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDescriptiveMeasure();}}

static class IfcElectricApplianceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricApplianceTypeEnum();}}

static class IfcSlabTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlabTypeEnum();}}

static class IfcVolumeMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVolumeMeasure();}}

static class IfcProjectedOrTrueLengthEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectedOrTrueLengthEnum();}}

static class IfcAreaMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAreaMeasure();}}

static class IfcIntegerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInteger();}}

static class IfcMassPerLengthMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMassPerLengthMeasure();}}

static class IfcDuctSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSegmentTypeEnum();}}

static class IfcElectricCurrentEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricCurrentEnum();}}

static class IfcIdentifierBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIdentifier();}}

static class IfcLinearStiffnessMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearStiffnessMeasure();}}

static class IfcTimeSeriesDataTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeSeriesDataTypeEnum();}}

static class IfcLightDistributionCurveEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightDistributionCurveEnum();}}

static class IfcLoadGroupTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLoadGroupTypeEnum();}}

static class IfcSpaceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceTypeEnum();}}

static class IfcSoundPowerMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundPowerMeasure();}}

static class IfcShearModulusMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShearModulusMeasure();}}

static class IfcFootingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFootingTypeEnum();}}

static class IfcMoistureDiffusivityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMoistureDiffusivityMeasure();}}

static class IfcAirTerminalBoxTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalBoxTypeEnum();}}

static class IfcStructuralSurfaceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceTypeEnum();}}

static class IfcStructuralCurveTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveTypeEnum();}}

static class IfcLuminousIntensityDistributionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLuminousIntensityDistributionMeasure();}}

static class IfcDoorStyleOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorStyleOperationEnum();}}

static class IfcModulusOfLinearSubgradeReactionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfLinearSubgradeReactionMeasure();}}

static class IfcSpaceHeaterTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceHeaterTypeEnum();}}

static class IfcPipeFittingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeFittingTypeEnum();}}

static class IfcBooleanBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoolean();}}

static class IfcThermalLoadTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalLoadTypeEnum();}}

static class IfcSwitchingDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSwitchingDeviceTypeEnum();}}

static class IfcProcedureTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProcedureTypeEnum();}}

static class IfcTankTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTankTypeEnum();}}

static class IfcSectionalAreaIntegralMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionalAreaIntegralMeasure();}}

static class IfcBeamTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBeamTypeEnum();}}

static class IfcMotorConnectionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMotorConnectionTypeEnum();}}

static class IfcDamperTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDamperTypeEnum();}}

static class IfcUnitaryEquipmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryEquipmentTypeEnum();}}

static class IfcReinforcingBarSurfaceEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBarSurfaceEnum();}}

static class IfcCableCarrierSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierSegmentTypeEnum();}}

static class IfcPileConstructionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPileConstructionEnum();}}

static class IfcDimensionCountBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionCount();}}

static class IfcCableCarrierFittingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierFittingTypeEnum();}}

static class IfcPermeableCoveringOperationEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPermeableCoveringOperationEnum();}}

static class IfcDerivedUnitEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedUnitEnum();}}

static class IfcMolecularWeightMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMolecularWeightMeasure();}}

static class IfcEnergyMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnergyMeasure();}}

static class IfcPipeSegmentTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeSegmentTypeEnum();}}

static class IfcGloballyUniqueIdBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGloballyUniqueId();}}

static class IfcTextAlignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextAlignment();}}

static class IfcThermalAdmittanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalAdmittanceMeasure();}}

static class IfcIsothermalMoistureCapacityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIsothermalMoistureCapacityMeasure();}}

static class IfcAirTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalTypeEnum();}}

static class IfcHeatExchangerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatExchangerTypeEnum();}}

static class IfcInductanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInductanceMeasure();}}

static class IfcNumericMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcNumericMeasure();}}

static class IfcConstraintEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstraintEnum();}}

static class IfcFlowDirectionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowDirectionEnum();}}

static class IfcAmountOfSubstanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAmountOfSubstanceMeasure();}}

static class IfcPowerMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPowerMeasure();}}

static class IfcCoilTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoilTypeEnum();}}

static class IfcProtectiveDeviceTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDeviceTypeEnum();}}

static class IfcNullStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcNullStyle();}}

static class IfcAnalysisModelTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnalysisModelTypeEnum();}}

static class IfcSensorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSensorTypeEnum();}}

static class IfcAlarmTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAlarmTypeEnum();}}

static class IfcOutletTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOutletTypeEnum();}}

static class IfcResourceConsumptionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcResourceConsumptionEnum();}}

static class IfcDoseEquivalentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoseEquivalentMeasure();}}

static class IfcHeatingValueMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatingValueMeasure();}}

static class IfcInventoryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInventoryTypeEnum();}}

static class IfcCoveringTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoveringTypeEnum();}}

static class IfcRailingTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRailingTypeEnum();}}

static class IfcReinforcingBarRoleEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBarRoleEnum();}}

static class IfcWarpingConstantMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWarpingConstantMeasure();}}

static class IfcValveTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcValveTypeEnum();}}

static class IfcPresentableTextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentableText();}}

static class IfcTransportElementTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransportElementTypeEnum();}}

static class IfcBoxAlignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoxAlignment();}}

static class IfcStackTerminalTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStackTerminalTypeEnum();}}

static class IfcCompressorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompressorTypeEnum();}}

static class IfcRampTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampTypeEnum();}}

static class IfcRoofTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoofTypeEnum();}}

static class IfcLinearMomentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearMomentMeasure();}}

static class IfcPositivePlaneAngleMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPositivePlaneAngleMeasure();}}

static class IfcVibrationIsolatorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVibrationIsolatorTypeEnum();}}

static class IfcAheadOrBehindBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAheadOrBehind();}}

static class IfcSecondInMinuteBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSecondInMinute();}}

static class IfcParameterValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcParameterValue();}}

static class IfcElectricVoltageMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricVoltageMeasure();}}

static class IfcWindowPanelPositionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowPanelPositionEnum();}}

static class IfcPlanarForceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlanarForceMeasure();}}

static class IfcThermalExpansionCoefficientMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalExpansionCoefficientMeasure();}}

static class IfcLogicalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLogical();}}

static class IfcAbsorbedDoseMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAbsorbedDoseMeasure();}}

static class IfcColumnTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColumnTypeEnum();}}

static class IfcCostScheduleTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostScheduleTypeEnum();}}

static class IfcModulusOfElasticityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfElasticityMeasure();}}

static class IfcRibPlateDirectionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRibPlateDirectionEnum();}}

static class IfcAirToAirHeatRecoveryTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirToAirHeatRecoveryTypeEnum();}}

static class IfcThermalTransmittanceMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalTransmittanceMeasure();}}

static class IfcBoilerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoilerTypeEnum();}}

static class IfcTemperatureGradientMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTemperatureGradientMeasure();}}

static class IfcDocumentConfidentialityEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentConfidentialityEnum();}}

static class IfcElectricGeneratorTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricGeneratorTypeEnum();}}

static class IfcModulusOfRotationalSubgradeReactionMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcModulusOfRotationalSubgradeReactionMeasure();}}

static class IfcOccupantTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOccupantTypeEnum();}}

static class IfcContextDependentMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcContextDependentMeasure();}}

static class IfcTextDecorationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextDecoration();}}

static class IfcTransitionCodeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransitionCode();}}

static class IfcStairFlightTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairFlightTypeEnum();}}

static class IfcActionTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActionTypeEnum();}}

static class IfcVaporPermeabilityMeasureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVaporPermeabilityMeasure();}}

static class IfcLayerSetDirectionEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLayerSetDirectionEnum();}}

static class IfcTendonTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendonTypeEnum();}}

static class IfcChillerTypeEnumBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChillerTypeEnum();}}

static class IfcSIUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSIUnit();}}

static class IfcRelAssignsToActorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToActor();}}

static class IfcDraughtingPreDefinedTextFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDraughtingPreDefinedTextFont();}}

static class IfcDirectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDirection();}}

static class IfcJunctionBoxTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcJunctionBoxType();}}

static class IfcFireSuppressionTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFireSuppressionTerminalType();}}

static class IfcRightCircularConeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRightCircularCone();}}

static class IfcReinforcingBarBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingBar();}}

static class IfcCoordinatedUniversalTimeOffsetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoordinatedUniversalTimeOffset();}}

static class IfcFlowStorageDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowStorageDevice();}}

static class IfcDuctSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSegmentType();}}

static class IfcStructuralSurfaceMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceMember();}}

static class IfcTypeObjectBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTypeObject();}}

static class IfcFacetedBrepWithVoidsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFacetedBrepWithVoids();}}

static class IfcMaterialLayerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialLayer();}}

static class IfcFaceSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceSurface();}}

static class IfcCircleProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCircleProfileDef();}}

static class IfcRelAssociatesProfilePropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesProfileProperties();}}

static class IfcFanTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFanType();}}

static class IfcGeometricCurveSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricCurveSet();}}

static class IfcEvaporativeCoolerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporativeCoolerType();}}

static class IfcOrderActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOrderAction();}}

static class File_DescriptionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new File_Description();}}

static class IfcRationalBezierCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRationalBezierCurve();}}

static class IfcFlowFittingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowFitting();}}

static class IfcEllipseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEllipse();}}

static class IfcWaterPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWaterProperties();}}

static class IfcPipeFittingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeFittingType();}}

static class IfcEnergyConversionDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnergyConversionDevice();}}

static class IfcPolygonalBoundedHalfSpaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPolygonalBoundedHalfSpace();}}

static class IfcSectionedSpineBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionedSpine();}}

static class IfcVirtualGridIntersectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVirtualGridIntersection();}}

static class IfcGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGroup();}}

static class IfcLightSourceDirectionalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceDirectional();}}

static class IfcPolyLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPolyLoop();}}

static class IfcActionRequestBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActionRequest();}}

static class IfcRelAssignsToResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToResource();}}

static class IfcRectangularTrimmedSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangularTrimmedSurface();}}

static class IfcDraughtingPreDefinedColourBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDraughtingPreDefinedColour();}}

static class IfcLocalTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLocalTime();}}

static class IfcEdgeLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEdgeLoop();}}

static class IfcSurfaceStyleShadingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleShading();}}

static class IfcDimensionCurveTerminatorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionCurveTerminator();}}

static class IfcConnectionPointEccentricityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionPointEccentricity();}}

static class IfcComplexPropertyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcComplexProperty();}}

static class IfcConstraintClassificationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstraintClassificationRelationship();}}

static class IfcOrganizationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOrganization();}}

static class IfcQuantityTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityTime();}}

static class IfcApplicationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApplication();}}

static class IfcOpenShellBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOpenShell();}}

static class IfcTimeSeriesValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeSeriesValue();}}

static class IfcHeatExchangerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHeatExchangerType();}}

static class IfcHygroscopicMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHygroscopicMaterialProperties();}}

static class IfcRelConnectsWithEccentricityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsWithEccentricity();}}

static class IfcColumnTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColumnType();}}

static class IfcProductDefinitionShapeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProductDefinitionShape();}}

static class IfcBlobTextureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBlobTexture();}}

static class IfcStructuralSteelProfilePropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSteelProfileProperties();}}

static class IfcActorRoleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActorRole();}}

static class IfcTableRowBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTableRow();}}

static class IfcVertexPointBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVertexPoint();}}

static class IfcPresentationStyleAssignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentationStyleAssignment();}}

static class IfcCurveStyleFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyleFont();}}

static class IfcMappedItemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMappedItem();}}

static class IfcConstructionProductResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionProductResource();}}

static class IfcPlanarExtentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlanarExtent();}}

static class IfcDimensionCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionCurve();}}

static class IfcMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMember();}}

static class IfcDamperTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDamperType();}}

static class IfcLShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLShapeProfileDef();}}

static class IfcRelSpaceBoundaryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelSpaceBoundary();}}

static class IfcTextStyleForDefinedFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyleForDefinedFont();}}

static class IfcMaterialLayerSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialLayerSet();}}

static class IfcElectricDistributionPointBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricDistributionPoint();}}

static class IfcMaterialClassificationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialClassificationRelationship();}}

static class IfcCondenserTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCondenserType();}}

static class IfcChillerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChillerType();}}

static class IfcMaterialLayerSetUsageBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialLayerSetUsage();}}

static class IfcImageTextureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcImageTexture();}}

static class IfcVirtualElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVirtualElement();}}

static class IfcSurfaceStyleWithTexturesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleWithTextures();}}

static class IfcActorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActor();}}

static class IfcRelContainedInSpatialStructureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelContainedInSpatialStructure();}}

static class IfcCircleHollowProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCircleHollowProfileDef();}}

static class IfcTerminatorSymbolBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTerminatorSymbol();}}

static class IfcConstructionEquipmentResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionEquipmentResource();}}

static class IfcPermitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPermit();}}

static class IfcStyledItemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStyledItem();}}

static class IfcOrganizationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOrganizationRelationship();}}

static class IfcDocumentElectronicFormatBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentElectronicFormat();}}

static class IfcAlarmTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAlarmType();}}

static class IfcRelAssignsToProductBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToProduct();}}

static class IfcPropertyEnumerationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyEnumeration();}}

static class IfcDiscreteAccessoryTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDiscreteAccessoryType();}}

static class IfcFaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFace();}}

static class IfcRelAssignsToGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToGroup();}}

static class IfcTubeBundleTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTubeBundleType();}}

static class IfcAssetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAsset();}}

static class IfcSurfaceStyleRenderingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleRendering();}}

static class IfcProcedureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProcedure();}}

static class IfcCurrencyRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurrencyRelationship();}}

static class IfcDoorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoor();}}

static class IfcVertexBasedTextureMapBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVertexBasedTextureMap();}}

static class IfcSpaceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceType();}}

static class IfcMechanicalMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalMaterialProperties();}}

static class IfcPointOnCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPointOnCurve();}}

static class IfcConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCondition();}}

static class IfcStructuralPointActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPointAction();}}

static class IfcRelConnectsStructuralMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsStructuralMember();}}

static class IfcAnnotationFillAreaOccurrenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationFillAreaOccurrence();}}

static class IfcFaceBasedSurfaceModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceBasedSurfaceModel();}}

static class IfcRampFlightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampFlight();}}

static class IfcOwnerHistoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOwnerHistory();}}

static class IfcDocumentInformationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentInformationRelationship();}}

static class File_NameBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new File_Name();}}

static class IfcRampFlightTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRampFlightType();}}

static class IfcDimensionalExponentsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionalExponents();}}

static class IfcRelVoidsElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelVoidsElement();}}

static class IfcDerivedUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedUnit();}}

static class IfcStructuralCurveMemberVaryingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveMemberVarying();}}

static class IfcRelAssociatesAppliedValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesAppliedValue();}}

static class IfcProjectOrderRecordBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectOrderRecord();}}

static class IfcServiceLifeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcServiceLife();}}

static class IfcQuantityWeightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityWeight();}}

static class IfcCurveStyleFontAndScalingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyleFontAndScaling();}}

static class IfcPropertyReferenceValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyReferenceValue();}}

static class IfcElementAssemblyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementAssembly();}}

static class IfcFaceOuterBoundBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceOuterBound();}}

static class IfcPreDefinedPointMarkerSymbolBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPreDefinedPointMarkerSymbol();}}

static class IfcOpeningElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOpeningElement();}}

static class IfcLightSourcePositionalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourcePositional();}}

static class IfcRelDefinesByTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelDefinesByType();}}

static class IfcSubContractResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSubContractResource();}}

static class IfcClassificationItemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassificationItem();}}

static class IfcOccupantBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOccupant();}}

static class IfcSurfaceStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyle();}}

static class IfcLaborResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLaborResource();}}

static class IfcRelAssociatesConstraintBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesConstraint();}}

static class IfcTextStyleWithBoxCharacteristicsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyleWithBoxCharacteristics();}}

static class IfcCostItemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostItem();}}

static class IfcFurnishingElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnishingElementType();}}

static class IfcSphereBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSphere();}}

static class IfcBuildingElementProxyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementProxy();}}

static class IfcRelAssignsTasksBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsTasks();}}

static class IfcEquipmentStandardBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEquipmentStandard();}}

static class IfcBoundingBoxBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundingBox();}}

static class IfcLibraryInformationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLibraryInformation();}}

static class IfcVertexLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVertexLoop();}}

static class IfcRadiusDimensionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRadiusDimension();}}

static class IfcPropertyConstraintRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyConstraintRelationship();}}

static class IfcBoxedHalfSpaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoxedHalfSpace();}}

static class IfcLightSourceGoniometricBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceGoniometric();}}

static class IfcTendonAnchorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendonAnchor();}}

static class IfcControllerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcControllerType();}}

static class IfcTransformerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransformerType();}}

static class IfcPreDefinedDimensionSymbolBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPreDefinedDimensionSymbol();}}

static class IfcCShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCShapeProfileDef();}}

static class IfcTextureMapBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextureMap();}}

static class IfcFuelPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFuelProperties();}}

static class IfcCableCarrierSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierSegmentType();}}

static class IfcSpaceThermalLoadPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceThermalLoadProperties();}}

static class IfcRelAssignsToControlBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToControl();}}

static class IfcElectricalBasePropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricalBaseProperties();}}

static class IfcTaskBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTask();}}

static class IfcSubedgeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSubedge();}}

static class IfcDistributionChamberElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionChamberElementType();}}

static class IfcPlateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlate();}}

static class IfcQuantityCountBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityCount();}}

static class IfcMoveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMove();}}

static class IfcRelAssociatesApprovalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesApproval();}}

static class IfcFlowTreatmentDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowTreatmentDevice();}}

static class IfcCoveringTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoveringType();}}

static class IfcLineBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLine();}}

static class IfcStructuralLoadPlanarForceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadPlanarForce();}}

static class IfcStairFlightBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairFlight();}}

static class IfcSanitaryTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSanitaryTerminalType();}}

static class IfcRelConnectsStructuralElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsStructuralElement();}}

static class IfcLightDistributionDataBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightDistributionData();}}

static class IfcWasteTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWasteTerminalType();}}

static class IfcSlabBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlab();}}

static class IfcFillAreaStyleTilesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFillAreaStyleTiles();}}

static class IfcEquipmentElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEquipmentElement();}}

static class IfcDuctFittingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctFittingType();}}

static class IfcSurfaceStyleLightingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleLighting();}}

static class IfcSiteBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSite();}}

static class IfcTrimmedCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTrimmedCurve();}}

static class IfcRepresentationContextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRepresentationContext();}}

static class IfcColourRgbBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColourRgb();}}

static class IfcRelAssociatesMaterialBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesMaterial();}}

static class IfcOrientedEdgeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOrientedEdge();}}

static class IfcElectricGeneratorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricGeneratorType();}}

static class IfcRelAssociatesClassificationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesClassification();}}

static class IfcDuctSilencerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDuctSilencerType();}}

static class IfcDimensionPairBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionPair();}}

static class IfcEnergyPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnergyProperties();}}

static class IfcPileBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPile();}}

static class IfcCraneRailFShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCraneRailFShapeProfileDef();}}

static class IfcMaterialBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterial();}}

static class IfcCircleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCircle();}}

static class IfcStructuralLoadSingleForceWarpingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleForceWarping();}}

static class IfcWallStandardCaseBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWallStandardCase();}}

static class IfcArbitraryProfileDefWithVoidsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArbitraryProfileDefWithVoids();}}

static class IfcTextStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyle();}}

static class IfcMechanicalSteelMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalSteelMaterialProperties();}}

static class IfcBeamBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBeam();}}

static class IfcOffsetCurve3DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOffsetCurve3D();}}

static class IfcApprovalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApproval();}}

static class IfcProductsOfCombustionPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProductsOfCombustionProperties();}}

static class IfcCurtainWallBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurtainWall();}}

static class IfcDistributionElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionElementType();}}

static class IfcIShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIShapeProfileDef();}}

static class IfcArbitraryOpenProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArbitraryOpenProfileDef();}}

static class IfcValveTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcValveType();}}

static class IfcExtrudedAreaSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExtrudedAreaSolid();}}

static class IfcActuatorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcActuatorType();}}

static class IfcTextureCoordinateGeneratorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextureCoordinateGenerator();}}

static class IfcPropertySetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySet();}}

static class IfcProtectiveDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProtectiveDeviceType();}}

static class IfcContextDependentUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcContextDependentUnit();}}

static class IfcConstraintRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstraintRelationship();}}

static class IfcOffsetCurve2DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOffsetCurve2D();}}

static class IfcBoundaryNodeConditionWarpingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryNodeConditionWarping();}}

static class IfcFurnitureStandardBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnitureStandard();}}

static class IfcVertexBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVertex();}}

static class IfcReinforcingMeshBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcingMesh();}}

static class IfcZoneBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcZone();}}

static class IfcRampBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRamp();}}

static class IfcStairFlightTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStairFlightType();}}

static class IfcMemberTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMemberType();}}

static class IfcTextureVertexBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextureVertex();}}

static class IfcTankTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTankType();}}

static class IfcCurveBoundedPlaneBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveBoundedPlane();}}

static class IfcEdgeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEdge();}}

static class IfcAnnotationFillAreaBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationFillArea();}}

static class IfcServiceLifeFactorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcServiceLifeFactor();}}

static class IfcMeasureWithUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMeasureWithUnit();}}

static class IfcMonetaryUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMonetaryUnit();}}

static class IfcTextLiteralWithExtentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextLiteralWithExtent();}}

static class IfcQuantityAreaBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityArea();}}

static class IfcUnitAssignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitAssignment();}}

static class IfcRelSchedulesCostItemsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelSchedulesCostItems();}}

static class IfcVibrationIsolatorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVibrationIsolatorType();}}

static class IfcRelAggregatesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAggregates();}}

static class IfcScheduleTimeControlBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcScheduleTimeControl();}}

static class IfcCompositeCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompositeCurve();}}

static class IfcRelAssignsToProcessBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToProcess();}}

static class IfcDraughtingCalloutBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDraughtingCallout();}}

static class IfcRelConnectsElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsElements();}}

static class IfcTextStyleFontModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyleFontModel();}}

static class IfcPropertyEnumeratedValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyEnumeratedValue();}}

static class IfcCartesianPointBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianPoint();}}

static class IfcBuildingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuilding();}}

static class IfcEllipseProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEllipseProfileDef();}}

static class IfcConversionBasedUnitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConversionBasedUnit();}}

static class IfcShellBasedSurfaceModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShellBasedSurfaceModel();}}

static class IfcAnnotationCurveOccurrenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationCurveOccurrence();}}

static class IfcAirTerminalBoxTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalBoxType();}}

static class IfcSwitchingDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSwitchingDeviceType();}}

static class IfcPlateTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlateType();}}

static class IfcProjectOrderBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectOrder();}}

static class IfcDoorStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorStyle();}}

static class IfcExternallyDefinedSurfaceStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternallyDefinedSurfaceStyle();}}

static class IfcSpaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpace();}}

static class IfcPlaneBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlane();}}

static class IfcSurfaceStyleRefractionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceStyleRefraction();}}

static class IfcBoundaryFaceConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryFaceCondition();}}

static class IfcFlowSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowSegment();}}

static class IfcTransportElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransportElementType();}}

static class IfcSurfaceOfLinearExtrusionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceOfLinearExtrusion();}}

static class IfcRectangleHollowProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangleHollowProfileDef();}}

static class IfcStackTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStackTerminalType();}}

static class IfcDistributionElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionElement();}}

static class IfcLocalPlacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLocalPlacement();}}

static class IfcUnitaryEquipmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUnitaryEquipmentType();}}

static class IfcBezierCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBezierCurve();}}

static class IfcExternallyDefinedTextFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternallyDefinedTextFont();}}

static class IfcFilterTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFilterType();}}

static class IfcStructuralPointConnectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPointConnection();}}

static class IfcDefinedSymbolBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDefinedSymbol();}}

static class IfcCostScheduleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostSchedule();}}

static class IfcBoundaryNodeConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryNodeCondition();}}

static class IfcRailingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRailing();}}

static class IfcCartesianTransformationOperator3DnonUniformBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator3DnonUniform();}}

static class IfcQuantityVolumeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityVolume();}}

static class IfcRepresentationMapBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRepresentationMap();}}

static class IfcElectricMotorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricMotorType();}}

static class IfcLightSourceAmbientBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceAmbient();}}

static class IfcTextLiteralBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextLiteral();}}

static class File_SchemaBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new File_Schema();}}

static class IfcStructuralCurveConnectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveConnection();}}

static class IfcElectricHeaterTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricHeaterType();}}

static class IfcElementQuantityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElementQuantity();}}

static class IfcRegularTimeSeriesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRegularTimeSeries();}}

static class IfcGridAxisBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGridAxis();}}

static class IfcCraneRailAShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCraneRailAShapeProfileDef();}}

static class IfcTendonBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTendon();}}

static class IfcRoundedEdgeFeatureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoundedEdgeFeature();}}

static class IfcWallTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWallType();}}

static class IfcBoundedSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundedSurface();}}

static class IfcPersonBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPerson();}}

static class IfcWorkPlanBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkPlan();}}

static class IfcBooleanResultBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBooleanResult();}}

static class IfcFastenerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFastenerType();}}

static class IfcTelecomAddressBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTelecomAddress();}}

static class IfcAnnotationTextOccurrenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationTextOccurrence();}}

static class IfcPropertyTableValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyTableValue();}}

static class IfcIrregularTimeSeriesValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIrregularTimeSeriesValue();}}

static class IfcDocumentInformationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentInformation();}}

static class IfcPipeSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPipeSegmentType();}}

static class IfcRelInteractionRequirementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelInteractionRequirements();}}

static class IfcReinforcementBarPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcementBarProperties();}}

static class IfcConditionCriterionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConditionCriterion();}}

static class IfcStructuralPlanarActionVaryingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPlanarActionVarying();}}

static class IfcArbitraryClosedProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcArbitraryClosedProfileDef();}}

static class IfcClassificationReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassificationReference();}}

static class IfcMotorConnectionTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMotorConnectionType();}}

static class IfcPermeableCoveringPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPermeableCoveringProperties();}}

static class IfcWindowBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindow();}}

static class IfcAxis1PlacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAxis1Placement();}}

static class IfcDerivedUnitElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedUnitElement();}}

static class IfcRibPlateProfilePropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRibPlateProfileProperties();}}

static class IfcRelServicesBuildingsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelServicesBuildings();}}

static class IfcBoundaryEdgeConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoundaryEdgeCondition();}}

static class IfcEnvironmentalImpactValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEnvironmentalImpactValue();}}

static class IfcCsgSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCsgSolid();}}

static class IfcCableSegmentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableSegmentType();}}

static class IfcApprovalActorRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApprovalActorRelationship();}}

static class IfcFacetedBrepBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFacetedBrep();}}

static class IfcCalendarDateBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCalendarDate();}}

static class IfcOneDirectionRepeatFactorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOneDirectionRepeatFactor();}}

static class IfcRelConnectsPortToElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsPortToElement();}}

static class IfcReinforcementDefinitionPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReinforcementDefinitionProperties();}}

static class IfcDerivedProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDerivedProfileDef();}}

static class IfcRelCoversBldgElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelCoversBldgElements();}}

static class IfcRelAssociatesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociates();}}

static class IfcClassificationNotationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassificationNotation();}}

static class IfcPresentationLayerAssignmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentationLayerAssignment();}}

static class IfcStructuralCurveMemberBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralCurveMember();}}

static class IfcConstraintAggregationRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstraintAggregationRelationship();}}

static class IfcStructuralLoadLinearForceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadLinearForce();}}

static class IfcSoundValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundValue();}}

static class IfcRectangularPyramidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangularPyramid();}}

static class IfcRelDefinesByPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelDefinesByProperties();}}

static class IfcPixelTextureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPixelTexture();}}

static class IfcTextStyleTextModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTextStyleTextModel();}}

static class IfcStairBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStair();}}

static class IfcShapeRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShapeRepresentation();}}

static class IfcEdgeCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEdgeCurve();}}

static class IfcConnectionCurveGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionCurveGeometry();}}

static class IfcPerformanceHistoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPerformanceHistory();}}

static class IfcStructuralLoadSingleForceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleForce();}}

static class IfcMaterialDefinitionRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialDefinitionRepresentation();}}

static class IfcCooledBeamTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCooledBeamType();}}

static class IfcDiameterDimensionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDiameterDimension();}}

static class IfcTypeProductBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTypeProduct();}}

static class IfcStructuralLoadSingleDisplacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleDisplacement();}}

static class IfcWindowPanelPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowPanelProperties();}}

static class IfcRailingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRailingType();}}

static class IfcElectricTimeControlTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricTimeControlType();}}

static class IfcPreDefinedTerminatorSymbolBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPreDefinedTerminatorSymbol();}}

static class IfcGeometricSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricSet();}}

static class IfcThermalMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcThermalMaterialProperties();}}

static class IfcAirToAirHeatRecoveryTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirToAirHeatRecoveryType();}}

static class IfcEvaporatorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcEvaporatorType();}}

static class IfcClassificationNotationFacetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassificationNotationFacet();}}

static class IfcPropertyListValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyListValue();}}

static class IfcDoorLiningPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorLiningProperties();}}

static class IfcBooleanClippingResultBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBooleanClippingResult();}}

static class IfcCenterLineProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCenterLineProfileDef();}}

static class IfcDraughtingPreDefinedCurveFontBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDraughtingPreDefinedCurveFont();}}

static class IfcCoveringBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCovering();}}

static class IfcPropertyDependencyRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyDependencyRelationship();}}

static class IfcApprovalRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApprovalRelationship();}}

static class IfcReferencesValueDocumentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcReferencesValueDocument();}}

static class IfcStructuralResultGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralResultGroup();}}

static class IfcAppliedValueRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAppliedValueRelationship();}}

static class IfcFailureConnectionConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFailureConnectionCondition();}}

static class IfcBeamTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBeamType();}}

static class IfcColumnBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcColumn();}}

static class IfcRectangleProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRectangleProfileDef();}}

static class IfcCurveStyleFontPatternBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyleFontPattern();}}

static class IfcLightIntensityDistributionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightIntensityDistribution();}}

static class IfcPointOnSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPointOnSurface();}}

static class IfcStructuralSurfaceConnectionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceConnection();}}

static class IfcStructuralPointReactionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPointReaction();}}

static class IfcLampTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLampType();}}

static class IfcSpaceHeaterTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceHeaterType();}}

static class IfcStyledRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStyledRepresentation();}}

static class IfcStructuredDimensionCalloutBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuredDimensionCallout();}}

static class IfcAnnotationSymbolOccurrenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationSymbolOccurrence();}}

static class IfcPathBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPath();}}

static class IfcStructuralProfilePropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralProfileProperties();}}

static class IfcElectricApplianceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricApplianceType();}}

static class IfcPolylineBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPolyline();}}

static class IfcProxyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProxy();}}

static class IfcExternallyDefinedHatchStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternallyDefinedHatchStyle();}}

static class IfcTwoDirectionRepeatFactorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTwoDirectionRepeatFactor();}}

static class IfcSectionPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionProperties();}}

static class IfcElectricFlowStorageDeviceTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricFlowStorageDeviceType();}}

static class IfcGasTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGasTerminalType();}}

static class IfcGeometricRepresentationSubContextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricRepresentationSubContext();}}

static class IfcStructuralLoadSingleDisplacementDistortionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadSingleDisplacementDistortion();}}

static class IfcBoilerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBoilerType();}}

static class IfcFaceBoundBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFaceBound();}}

static class IfcRelReferencedInSpatialStructureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelReferencedInSpatialStructure();}}

static class IfcSystemFurnitureElementTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSystemFurnitureElementType();}}

static class IfcAnnotationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotation();}}

static class IfcTrapeziumProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTrapeziumProfileDef();}}

static class IfcFillAreaStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFillAreaStyle();}}

static class IfcConnectionPointGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionPointGeometry();}}

static class IfcRelAssociatesDocumentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesDocument();}}

static class IfcPresentationLayerWithStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPresentationLayerWithStyle();}}

static class IfcFlowControllerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowController();}}

static class IfcRoofBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoof();}}

static class IfcVectorBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcVector();}}

static class IfcGeneralProfilePropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeneralProfileProperties();}}

static class IfcHumidifierTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHumidifierType();}}

static class IfcWindowLiningPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowLiningProperties();}}

static class IfcDiscreteAccessoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDiscreteAccessory();}}

static class IfcBuildingElementProxyTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementProxyType();}}

static class IfcHalfSpaceSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcHalfSpaceSolid();}}

static class IfcFurnishingElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnishingElement();}}

static class IfcAirTerminalTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAirTerminalType();}}

static class IfcApprovalPropertyRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcApprovalPropertyRelationship();}}

static class IfcMechanicalConcreteMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalConcreteMaterialProperties();}}

static class IfcAngularDimensionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAngularDimension();}}

static class IfcPumpTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPumpType();}}

static class IfcLoopBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLoop();}}

static class IfcFurnitureTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFurnitureType();}}

static class IfcPlanarBoxBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPlanarBox();}}

static class IfcPostalAddressBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPostalAddress();}}

static class IfcObjectiveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcObjective();}}

static class IfcRevolvedAreaSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRevolvedAreaSolid();}}

static class IfcRelAssignsToProjectOrderBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssignsToProjectOrder();}}

static class IfcFlowTerminalBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowTerminal();}}

static class IfcProjectBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProject();}}

static class IfcWallBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWall();}}

static class IfcRelProjectsElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelProjectsElement();}}

static class IfcDocumentReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDocumentReference();}}

static class IfcRelAssociatesLibraryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelAssociatesLibrary();}}

static class IfcCompressorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompressorType();}}

static class IfcSpaceProgramBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSpaceProgram();}}

static class IfcBuildingStoreyBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingStorey();}}

static class IfcSweptDiskSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSweptDiskSolid();}}

static class IfcTimeSeriesReferenceRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeSeriesReferenceRelationship();}}

static class Ifc2DCompositeCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new Ifc2DCompositeCurve();}}

static class IfcCartesianTransformationOperator2DnonUniformBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator2DnonUniform();}}

static class IfcChamferEdgeFeatureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcChamferEdgeFeature();}}

static class IfcProjectionElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectionElement();}}

static class IfcMechanicalFastenerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalFastener();}}

static class IfcTransportElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTransportElement();}}

static class IfcTimeSeriesScheduleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTimeSeriesSchedule();}}

static class IfcRelSequenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelSequence();}}

static class IfcFillAreaStyleTileSymbolWithStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFillAreaStyleTileSymbolWithStyle();}}

static class IfcFluidFlowPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFluidFlowProperties();}}

static class IfcFootingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFooting();}}

static class IfcProductRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProductRepresentation();}}

static class IfcConnectedFaceSetBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectedFaceSet();}}

static class IfcBuildingElementPartBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBuildingElementPart();}}

static class IfcAxis2Placement3DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAxis2Placement3D();}}

static class IfcLightSourceSpotBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightSourceSpot();}}

static class IfcStructuralPlanarActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralPlanarAction();}}

static class IfcProjectionCurveBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcProjectionCurve();}}

static class IfcLinearDimensionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLinearDimension();}}

static class IfcClassificationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassification();}}

static class IfcFlowMovingDeviceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowMovingDevice();}}

static class IfcUShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcUShapeProfileDef();}}

static class IfcPersonAndOrganizationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPersonAndOrganization();}}

static class IfcMetricBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMetric();}}

static class IfcLightFixtureTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLightFixtureType();}}

static class IfcSurfaceOfRevolutionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceOfRevolution();}}

static class IfcCableCarrierFittingTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCableCarrierFittingType();}}

static class IfcStructuralLoadTemperatureBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadTemperature();}}

static class IfcRightCircularCylinderBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRightCircularCylinder();}}

static class IfcCostValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCostValue();}}

static class IfcElectricalCircuitBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricalCircuit();}}

static class IfcFillAreaStyleHatchingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFillAreaStyleHatching();}}

static class IfcShapeAspectBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcShapeAspect();}}

static class IfcRelConnectsPathElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsPathElements();}}

static class IfcConstructionMaterialResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConstructionMaterialResource();}}

static class IfcIrregularTimeSeriesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcIrregularTimeSeries();}}

static class IfcStructuralLinearActionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLinearAction();}}

static class IfcGeneralMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeneralMaterialProperties();}}

static class IfcCompositeCurveSegmentBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompositeCurveSegment();}}

static class IfcGridPlacementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGridPlacement();}}

static class IfcOpticalMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOpticalMaterialProperties();}}

static class IfcDateAndTimeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDateAndTime();}}

static class IfcStructuralLinearActionVaryingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLinearActionVarying();}}

static class IfcExternallyDefinedSymbolBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExternallyDefinedSymbol();}}

static class IfcDistributionControlElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionControlElement();}}

static class IfcInventoryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcInventory();}}

static class IfcTShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTShapeProfileDef();}}

static class IfcDoorPanelPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDoorPanelProperties();}}

static class IfcDimensionCalloutRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionCalloutRelationship();}}

static class IfcGridBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGrid();}}

static class IfcDistributionChamberElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionChamberElement();}}

static class IfcFlowInstrumentTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowInstrumentType();}}

static class IfcTopologyRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTopologyRepresentation();}}

static class IfcDistributionPortBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionPort();}}

static class IfcAnnotationSurfaceOccurrenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationSurfaceOccurrence();}}

static class IfcCurveStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurveStyle();}}

static class IfcRelFlowControlElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelFlowControlElements();}}

static class IfcCartesianTransformationOperator3DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator3D();}}

static class IfcStructuralSurfaceMemberVaryingBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralSurfaceMemberVarying();}}

static class IfcFastenerBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFastener();}}

static class IfcStructuralAnalysisModelBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralAnalysisModel();}}

static class IfcLibraryReferenceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcLibraryReference();}}

static class IfcRelaxationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelaxation();}}

static class IfcSoundPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSoundProperties();}}

static class IfcClosedShellBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClosedShell();}}

static class IfcRelFillsElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelFillsElement();}}

static class IfcCurtainWallTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCurtainWallType();}}

static class IfcAxis2Placement2DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAxis2Placement2D();}}

static class IfcFlowMeterTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcFlowMeterType();}}

static class IfcWorkScheduleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWorkSchedule();}}

static class IfcConnectionPortGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionPortGeometry();}}

static class IfcCrewResourceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCrewResource();}}

static class IfcSlabTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlabType();}}

static class IfcRelConnectsStructuralActivityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsStructuralActivity();}}

static class IfcCoolingTowerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoolingTowerType();}}

static class IfcOutletTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcOutletType();}}

static class IfcRelCoversSpacesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelCoversSpaces();}}

static class IfcRelConnectsWithRealizingElementsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsWithRealizingElements();}}

static class IfcDraughtingCalloutRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDraughtingCalloutRelationship();}}

static class IfcSectionReinforcementPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSectionReinforcementProperties();}}

static class IfcElectricalElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcElectricalElement();}}

static class IfcSystemBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSystem();}}

static class IfcRelOverridesPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelOverridesProperties();}}

static class IfcWindowStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcWindowStyle();}}

static class IfcSymbolStyleBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSymbolStyle();}}

static class IfcSensorTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSensorType();}}

static class IfcStructuralLoadGroupBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcStructuralLoadGroup();}}

static class IfcMechanicalFastenerTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMechanicalFastenerType();}}

static class IfcConnectionSurfaceGeometryBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcConnectionSurfaceGeometry();}}

static class IfcRelNestsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelNests();}}

static class IfcMaterialListBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcMaterialList();}}

static class IfcDistributionFlowElementBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDistributionFlowElement();}}

static class IfcTableBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcTable();}}

static class IfcRoundedRectangleProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRoundedRectangleProfileDef();}}

static class IfcAnnotationSurfaceBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAnnotationSurface();}}

static class IfcExtendedMaterialPropertiesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcExtendedMaterialProperties();}}

static class IfcClassificationItemRelationshipBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcClassificationItemRelationship();}}

static class IfcPropertyBoundedValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertyBoundedValue();}}

static class IfcCompositeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCompositeProfileDef();}}

static class IfcGeometricRepresentationContextBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcGeometricRepresentationContext();}}

static class IfcAsymmetricIShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcAsymmetricIShapeProfileDef();}}

static class IfcRelConnectsPortsBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelConnectsPorts();}}

static class IfcQuantityLengthBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcQuantityLength();}}

static class IfcSlippageConnectionConditionBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSlippageConnectionCondition();}}

static class IfcRepresentationBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRepresentation();}}

static class IfcRelOccupiesSpacesBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcRelOccupiesSpaces();}}

static class IfcZShapeProfileDefBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcZShapeProfileDef();}}

static class IfcDimensionCurveDirectedCalloutBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcDimensionCurveDirectedCallout();}}

static class IfcSurfaceCurveSweptAreaSolidBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcSurfaceCurveSweptAreaSolid();}}

static class IfcPropertySingleValueBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPropertySingleValue();}}

static class IfcCoilTypeBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCoilType();}}

static class IfcBlockBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcBlock();}}

static class IfcCartesianTransformationOperator2DBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcCartesianTransformationOperator2D();}}

static class IfcPhysicalComplexQuantityBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new IfcPhysicalComplexQuantity();}}

static class INTEGERBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new INTEGER();}}

static class DOUBLEBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new DOUBLE();}}

static class BOOLEANBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new BOOLEAN();}}

static class BINARYBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new BINARY();}}

static class REALBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new REAL();}}

static class STRINGBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new STRING();}}

static class LOGICALBuilder implements ObjectFactory.ClassBuilder
{public Object instance(){return new LOGICAL();}}

}

