package models.constants;

import java.util.HashMap;
import java.util.Map;

public final class DefaultPostParameters {

    private DefaultPostParameters(){}

    public static Map<String, String> getParams() {
        Map<String, String> map = new HashMap<>();
        map.put("__EVENTTARGET", "btnSubmitAmadeus");
        map.put("__EVENTARGUMENT", "");
        map.put("LANGUAGE", "GB");
        map.put("SITE", "SKBKSKBK");
        map.put("EMBEDDED_TRANSACTION", "FlexPricerAvailability");
        map.put("SIP_INTERNAL", "44454641554C545F4E44505F4345505F49443D32313230383826504152414D455445525F434845434B53554D3D3633264345505F49443D3231353435342652454449524543545F55524C3D25326664656661756C742E617370782533666964253364362532366570736C616E6775616765253364656E265354415254504147455F49443D36264D41524B45543D3432265744535F50524F4D4F434F44455F524547494F4E5F454E41424C45523D446F6D65737469632D74727565253361496E737465725363616E642D74727565253361496E746572636F6E742D747275652533614575726F70652D74727565265245565F5744535F4F42464545533D253363253366786D6C2B76657273696F6E25336427312E30272B656E636F64696E672533642769736F2D383835392D3127253366253365253363534F5F474C253365253363474C4F42414C5F4C4953542533652533634E414D45253365534954455F4C4953545F4F425F4645455F434F44455F544F5F4558454D50542533632532664E414D452533652533634C4953545F454C454D454E54253365253363434F4445253365543031253363253266434F44452533652533634C4953545F56414C55452533655430312533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E542533652533634C4953545F454C454D454E54253365253363434F4445253365543032253363253266434F44452533652533634C4953545F56414C55452533655430322533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E54253365253363253266474C4F42414C5F4C495354253365253363253266534F5F474C253365");
        map.put("WDS_FLOW", "REVENUE");
        map.put("WDS_FACADE_CALLBACK", "https://classic.flysas.com/AmadeusFacade/default.aspx?epslanguage=en");
        map.put("SO_SITE_ATC_ALLOW_LSA_INDIC", "TRUE");
        map.put("SO_SITE_ADVANCED_CATEGORIES", "TRUE");
        map.put("SO_SITE_TK_OFFICE_ID", "LUXSK08RV");
        map.put("SO_SITE_QUEUE_OFFICE_ID", "LUXSK08RV");
        map.put("SO_SITE_CSSR_TAXES", "FALSE");
        map.put("SO_SITE_OFFICE_ID", "LUXSK08RV");
        map.put("SO_SITE_ETKT_Q_AND_CAT", "32C0");
        map.put("SO_SITE_FP_CAL_DISP_NA_DATE", "TRUE");
        map.put("SO_SITE_ETKT_Q_OFFICE_ID", "LUXSK08RV");
        map.put("SO_GL", "<SO_GL><GLOBAL_LIST><NAME>SITE_QUEUE_DEFINITION_LIST</NAME><LIST_ELEMENT><CODE>0</CODE><LIST_VALUE>SRV</LIST_VALUE><LIST_VALUE>LUXSK08RV</LIST_VALUE><LIST_VALUE>34</LIST_VALUE><LIST_VALUE>0</LIST_VALUE></LIST_ELEMENT><LIST_ELEMENT><CODE>1</CODE><LIST_VALUE>CAN</LIST_VALUE><LIST_VALUE>LUXSK08RV</LIST_VALUE><LIST_VALUE>31</LIST_VALUE><LIST_VALUE>0</LIST_VALUE></LIST_ELEMENT><LIST_ELEMENT><CODE>2</CODE><LIST_VALUE>RIR</LIST_VALUE><LIST_VALUE>LUXSK08RV</LIST_VALUE><LIST_VALUE>30</LIST_VALUE><LIST_VALUE>0</LIST_VALUE></LIST_ELEMENT><LIST_ELEMENT><CODE>3</CODE><LIST_VALUE>REI</LIST_VALUE><LIST_VALUE>LUXSK08RV</LIST_VALUE><LIST_VALUE>30</LIST_VALUE><LIST_VALUE>0</LIST_VALUE></LIST_ELEMENT><LIST_ELEMENT><CODE>4</CODE><LIST_VALUE>AWA</LIST_VALUE><LIST_VALUE>LUXSK08RV</LIST_VALUE><LIST_VALUE>8</LIST_VALUE><LIST_VALUE>1</LIST_VALUE></LIST_ELEMENT><LIST_ELEMENT><CODE>6</CODE><LIST_VALUE>RIP</LIST_VALUE><LIST_VALUE>LUXSK08RV</LIST_VALUE><LIST_VALUE>30</LIST_VALUE><LIST_VALUE>0</LIST_VALUE></LIST_ELEMENT></GLOBAL_LIST><GLOBAL_LIST><NAME>SITE_LIST_OB_FEE_CODE_TO_EXEMPT</NAME><LIST_ELEMENT><CODE>T01</CODE><LIST_VALUE>T01</LIST_VALUE></LIST_ELEMENT><LIST_ELEMENT><CODE>T02</CODE><LIST_VALUE>T02</LIST_VALUE></LIST_ELEMENT></GLOBAL_LIST></SO_GL>");
        map.put("SO_SITE_FD_SOLDOUT_FLIGHT", "TRUE");
        map.put("SO_SITE_QUEUE_CATEGORY", "8C50");
        map.put("SO_SITE_ALLOW_LSA_INDICATOR", "TRUE");
        map.put("WDS_SERVICING_FLOW_TE_MEAL", "TRUE");
        map.put("WDS_AVD_SEL_FLIGHTS", "FALSE");
        map.put("WDS_CAL_RANGE", "15");
        map.put("WDS_SERVICING_FLOW_TE_FBAG", "TRUE");
        map.put("WDS_SHOW_INVINFO", "FALSE");
        map.put("WDS_BOOKING_FLOW_TE_MEAL", "TRUE");
        map.put("WDS_PROMOCODE", "TRUE");
        map.put("WDS_ACTIVATE_APP_FOR_CC_MOP", "TRUE");
        map.put("PRICING_TYPE", "C");
        map.put("WDS_SHOW_TAXES", "TRUE");
        map.put("B_LOCATION_1", "OSL+");
        map.put("WDS_FO_IATA", "47490822");
        map.put("WDS_SHOW_ADDCAL", "TRUE");
        map.put("WDS_USE_FQN", "TRUE");
        map.put("WDS_ACTIVATE_APP_FOR_ALL_MOP", "FALSE");
        map.put("COMMERCIAL_FARE_FAMILY_1", "SKSTDA");
        map.put("WDS_CHECKIN_NOTIF", "FALSE");
        map.put("TRIP_TYPE", "R");
        map.put("WDS_HELPCONTACTURL", "http://classic.sas.se/en/misc/Arkiv/contact-sia-/");
        map.put("WDS_SAS_CREDITS", "TRUE");
        map.put("WDS_ANCILLARIES", "FALSE");
        map.put("WDS_BOOKING_FLOW_TE_FBAG", "TRUE");
        map.put("WDS_CC_LIST", "AX-SAS/ERETAIL_LU-true:CA-SAS/ERETAIL_LU-true:VI-SAS/ERETAIL_LU-true:DC-SAS/ERETAIL_LU-false:DS-SAS/ERETAIL_LU-true:TP-SAS/ERETAIL_LU-false");
        map.put("WDS_SASCPCTRANGE", "2-6");
        map.put("WDS_SHOW_AB", "TRUE");
        map.put("WDS_FOID_EXCL_LIST", "DK");
        map.put("DATE_RANGE_VALUE_1", "1");
        map.put("WDS_SERVICING_FLOW_TE_SEATMAP", "TRUE");
        map.put("DATE_RANGE_VALUE_2", "1");
        map.put("WDS_BOOKING_FLOW_TE_XBAG", "TRUE");
        map.put("WDS_POINTS_EARNED", "SHOW");
        map.put("WDS_ORIGIN_SITE", "LU");
        map.put("WDS_SHOW_CMP_CODE", "TRUE");
        map.put("TRAVELLER_TYPE_1", "ADT");
        map.put("WDS_NEWSLETTER_FCO", "FALSE");
        map.put("B_LOCATION_2", "RIX");
        map.put("WDS_BOOKING_FLOW_TE_SEATMAP", "TRUE");
        map.put("WDS_TIME_OPTION", "True");
        map.put("WDS_FRAS", "TRUE");
        map.put("DISPLAY_TYPE", "2");
        map.put("WDS_MOBILE_NEW_DESIGN", "TRUE");
        map.put("WDS_SERVICING_FLOW_TE_XBAG", "TRUE");
        map.put("WDS_SHOW_MINISEARCH", "LINK");
        map.put("B_DATE_1", "201810080000");
        map.put("B_DATE_2", "201810140000");
        map.put("E_LOCATION_2", "OSL+");
        map.put("E_LOCATION_1", "RIX");
        map.put("WDS_EBMS_CAMPAIGN", "TRUE");
        map.put("DATE_RANGE_QUALIFIER_2", "C");
        map.put("DATE_RANGE_QUALIFIER_1", "C");
        map.put("ENCT", "1");
        map.put("ENC", "62136732AF75289196523183CBBC8957F7F5AB4EDC6BAB0C284A070039641C23347E1B9DDE09436FAA12FE02EE1BB2B6723CDBF97A27DEDCB97EB08BDF6A478B2A0111FCE71421C05DBC9606E9548566821D54662375D7AC81DDA437353974A479F97CE986BFD45AD828EE94111443CD79F97CE986BFD45AD828EE94111443CD");
        map.put("__PREVIOUSPAGE", "EOuVgEVGcPaooWlcQzY7uwfysikykaVpb-H5wZ3xp_fcVkbM_4Y3Yh3_OEwpzEWi5gOj_s80sjeP-1yYWe-Fp-6rsY8xAKiOA8--sL0aS3jICz0W0");
        map.put("__VIEWSTATE", "/wEPDwUKMTE1MTc0MDk0N2RkuN2qfxyKJHLW+uU0D7+B8ZTdGMU=");
        map.put("__VIEWSTATEGENERATOR", "BAA3076B");
        return map;
    }

    public static Map<String, String> getParamsForUrlPathPost(){
        Map<String, String> map = new HashMap<>();
        map.put("__EVENTTARGET", "ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$Searchbtn$ButtonLink");
        map.put("__EVENTARGUMENT", "");
        map.put("ctl00$FullRegion$TopRegion$_siteHeader$hdnProfilingConsent", "");
        map.put("ctl00$FullRegion$TopRegion$_siteHeader$hdnTermsConsent", "");
        map.put("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$uid", "");
        map.put("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$pwd", "");
        map.put("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$hdnShowModal", "");
        map.put("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$hdnIsEb0", "");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$ceptravelTypeSelector$TripTypeSelector", "roundtrip");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenIntercont", "False");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenDomestic", "NO,LV");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFareType", "A");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtFrom", "Oslo, Norway - Gardermoen (OSL+)");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFrom", "OSL+");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtTo", "Riga, Latvia - Riga (RIX)");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenTo", "RIX");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtFromTOJ", "");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFromTOJ", "");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenOutbound", "2018-10-08");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenReturn", "2018-10-14");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hdnSelectedOutboundMonth", "");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hdnSelectedReturnMonth", "");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenReturnCalVisible", "");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenStoreCalDates", "Sun Sep 23 2018 00:00:00 GMT+0300 (Eastern European Summer Time),Sun Sep 23 2018 00:00:00 GMT+0300 (Eastern European Summer Time),Tue Sep 17 2019 00:00:00 GMT+0300 (Eastern European Summer Time)");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$selectOutbound", "2018-10-01");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$selectReturn", "2018-10-01");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$FlexDateSelector", "Show selected dates");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeAdult", "1");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeChild211", "0");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeInfant", "0");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepNdpFareTypeSelector$ddlFareTypeSelector", "A");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$hdnsetDefaultValue", "true");
        map.put("ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$hdncalendarDropdown", "true");
        map.put("__PREVIOUSPAGE", "3aoIK5urOF6qLmjEUVWoe7Zlok_H7Ef8UkS2oCFR_Ccg24aQSIRhidbF3PGeuRmIFTuiGxx8ealPNKfgqBWh77mCC2k1");
        map.put("__VIEWSTATE", "/wEPDwUJNjIyMTczODM5D2QWAmYPZBYCAgEQZGQWAgIBD2QWAgICD2QWAgIDD2QWAgICD2QWBAIBD2QWAgIBD2QWAmYPZBYEZg8WAh4FY2xhc3MFCWFjdGl2ZUNFUBYWZg8VAQtCb29rIGEgdHJpcGQCBQ8PZBYCHgtDRVBQYWdlRGF0YQUXRVBpU2VydmVyLkNvcmUuUGFnZURhdGFkAgsPD2QWAh4TTm90aWZpY2F0aW9uQ29udHJvbAUuQVNQLnNhc190ZW1wbGF0ZXNfdXRpbF9ub3RpZmljYXRpb25kaWFsb2dfYXNjeBYIAgUPZBYCAgEPEA8WAh4LXyFEYXRhQm91bmRnZGQWAGQCCQ8PFgQeC19pc0VkaXRhYmxlaB4JX3BhZ2VMaW5rKClsRVBpU2VydmVyLkNvcmUuUGFnZVJlZmVyZW5jZSwgRVBpU2VydmVyLCBWZXJzaW9uPTYuMS4zNzkuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj04ZmU4M2RlYTczOGI0NWI3BjIxNTQ1NGRkAgoPZBYCZg9kFgQCAQ8WAh4Fc3R5bGUFDmRpc3BsYXk6IGJsb2NrFgICAQ8WAh4JaW5uZXJodG1sBT88c3R5bGU+DQouYWN0aXZlQ0VQe3otaW5kZXg6MTAwOyBwb3NpdGlvbjpyZWxhdGl2ZX0NCjwvc3R5bGU+DQpkAgMPEA8WAh8DZ2RkFgBkAgsPFQI+aHR0cDovL2NsYXNzaWMuZmx5c2FzLmNvbS9kZWZhdWx0LmFzcHg/aWQ9NiZhbXA7ZXBzbGFuZ3VhZ2U9ZW4FUmVzZXRkAg0PDxYCHgdWaXNpYmxlZxYCHwIFLkFTUC5zYXNfdGVtcGxhdGVzX3V0aWxfbm90aWZpY2F0aW9uZGlhbG9nX2FzY3gWDAIDD2QWAmYPFgIfCGcWAgIBD2QWAmYPZBYCZg9kFgYCAQ9kFgJmDxYCHgRUZXh0BbYBPGxhYmVsIGZvcj0iY3RsMDBfRnVsbFJlZ2lvbl9NYWluUmVnaW9uX0NvbnRlbnRSZWdpb25fQ29udGVudEZ1bGxSZWdpb25fQ29udGVudExlZnRSZWdpb25fQ0VQR3JvdXAxX0NFUEFjdGl2ZV9jZXBORFBSZXZCb29raW5nQXJlYV9jZXB0cmF2ZWxUeXBlU2VsZWN0b3Jfcm91bmR0cmlwIj5Sb3VuZCB0cmlwPC9sYWJlbD5kAgMPZBYCZg8WAh8JBbABPGxhYmVsIGZvcj0iY3RsMDBfRnVsbFJlZ2lvbl9NYWluUmVnaW9uX0NvbnRlbnRSZWdpb25fQ29udGVudEZ1bGxSZWdpb25fQ29udGVudExlZnRSZWdpb25fQ0VQR3JvdXAxX0NFUEFjdGl2ZV9jZXBORFBSZXZCb29raW5nQXJlYV9jZXB0cmF2ZWxUeXBlU2VsZWN0b3Jfb25ld2F5Ij5PbmUgd2F5PC9sYWJlbD5kAgUPZBYCZg8WAh8JBcIBPGxhYmVsIGZvcj0iY3RsMDBfRnVsbFJlZ2lvbl9NYWluUmVnaW9uX0NvbnRlbnRSZWdpb25fQ29udGVudEZ1bGxSZWdpb25fQ29udGVudExlZnRSZWdpb25fQ0VQR3JvdXAxX0NFUEFjdGl2ZV9jZXBORFBSZXZCb29raW5nQXJlYV9jZXB0cmF2ZWxUeXBlU2VsZWN0b3Jfb3BlbmphdyI+UmV0dXJuIGZyb20gYW5vdGhlciBjaXR5PC9sYWJlbD5kAgYPFgIfCGcWAgIBDxAPFgIfA2dkDxYCZgIBFgIQBRdTaG93IGEgbW9udGhseSBjYWxlbmRhcgUXU2hvdyBhIG1vbnRobHkgY2FsZW5kYXJnEAUTU2hvdyBzZWxlY3RlZCBkYXRlcwUTU2hvdyBzZWxlY3RlZCBkYXRlc2dkZAIHDxYCHwhoZAIID2QWAmYPZBYGAgEPEA8WAh8DZ2RkZGQCAg8QDxYCHwNnZGRkZAIDDxAPFgIfA2dkZGRkAgkPZBYCZg9kFgQCAQ8WAh8GBQ5kaXNwbGF5OiBibG9jaxYCAgEPFgIfBwU/PHN0eWxlPg0KLmFjdGl2ZUNFUHt6LWluZGV4OjEwMDsgcG9zaXRpb246cmVsYXRpdmV9DQo8L3N0eWxlPg0KZAIDDxAPFgIfA2dkZGRkAgoPFQIsL3RlbXBsYXRlcy9DRVAuYXNweD9pZD0yMTU0NTQmZXBzbGFuZ3VhZ2U9ZW4FUmVzZXRkAg8PD2QWAh8CBS5BU1Auc2FzX3RlbXBsYXRlc191dGlsX25vdGlmaWNhdGlvbmRpYWxvZ19hc2N4FgoCBA9kFgRmD2QWBGYPFQEbVHJhdmVsIFBhc3MgbnVtYmVyIGluIHVzZSA6ZAIDD2QWAmYPFQEZQ2hhbmdlIFRyYXZlbCBQYXNzIG51bWJlcmQCAg9kFgQCAQ8QDxYCHwkFGEJvb2sgYXMgYSB0cmF2ZWwgbWFuYWdlcmRkZGQCAw8QDxYCHwkFEU9ubHkgbWUgdHJhdmVsaW5nZGRkZAIID2QWCmYPFQEGU2VsZWN0ZAIDDxAWAh8DZ2QUKwEAZAIGDxAWAh8DZ2QUKwEAZAIKDxAWAh8DZ2QUKwEAZAINDxAWAh8DZ2QUKwEAZAIOD2QWAgICDxUMCVRyYXZlbGVycxBTZWxlY3QgdHJhdmVsZXJzBUNsb3NlEFNlbGVjdCB0cmF2ZWxlcnMNaXMgdHJhdmVsbGluZwNZZXMCTm8TTnVtYmVyIG9mIHRyYXZlbGVycwhUcmF2ZWxlcg5Ob25lIHRvIHNlbGVjdAZTZWxlY3QCT0tkAhAPZBYCZg9kFgQCAQ8WAh8GBQ5kaXNwbGF5OiBibG9jaxYCAgEPFgIfBwU/PHN0eWxlPg0KLmFjdGl2ZUNFUHt6LWluZGV4OjEwMDsgcG9zaXRpb246cmVsYXRpdmV9DQo8L3N0eWxlPg0KZAIDDxAPFgIfA2dkZBYAZAIRDxUCLC90ZW1wbGF0ZXMvQ0VQLmFzcHg/aWQ9MjE1NDU0JmVwc2xhbmd1YWdlPWVuBVJlc2V0ZAIRDw9kFgIfAgUuQVNQLnNhc190ZW1wbGF0ZXNfdXRpbF9ub3RpZmljYXRpb25kaWFsb2dfYXNjeBYGAgYPZBYEZg8VARtUcmF2ZWwgUGFzcyBudW1iZXIgaW4gdXNlIDpkAgMPZBYCZg8VARlDaGFuZ2UgVHJhdmVsIFBhc3MgbnVtYmVyZAIOD2QWAmYPZBYEAgEPFgIfBgUOZGlzcGxheTogYmxvY2sWAgIBDxYCHwcFPzxzdHlsZT4NCi5hY3RpdmVDRVB7ei1pbmRleDoxMDA7IHBvc2l0aW9uOnJlbGF0aXZlfQ0KPC9zdHlsZT4NCmQCAw8QDxYCHwNnZGQWAGQCDw8VAiwvdGVtcGxhdGVzL0NFUC5hc3B4P2lkPTIxNTQ1NCZlcHNsYW5ndWFnZT1lbgVSZXNldGQCEw8PZBYCHwIFLkFTUC5zYXNfdGVtcGxhdGVzX3V0aWxfbm90aWZpY2F0aW9uZGlhbG9nX2FzY3gWBAIMD2QWAmYPZBYCAgMPEA8WAh8DZ2RkFgBkAg0PZBYCZg8VAQ1Nb2RpZnkgc2VhcmNoZAIVDw9kFgIfAgUuQVNQLnNhc190ZW1wbGF0ZXNfdXRpbF9ub3RpZmljYXRpb25kaWFsb2dfYXNjeBYEAgsPZBYCZg9kFgICAw8QDxYCHwNnZGQWAGQCDA9kFgJmDxUBDU1vZGlmeSBzZWFyY2hkAhkPZBYCZg9kFgRmDxYCHwhoFgJmDxUBAGQCAQ8VAQBkAh8PZBYEZg8VAnRjdGwwMF9GdWxsUmVnaW9uX01haW5SZWdpb25fQ29udGVudFJlZ2lvbl9Db250ZW50RnVsbFJlZ2lvbl9Db250ZW50TGVmdFJlZ2lvbl9DRVBHcm91cDFfQ0VQQWN0aXZlX0NNUENvZGVfYnRuQm9va05vd3RjdGwwMF9GdWxsUmVnaW9uX01haW5SZWdpb25fQ29udGVudFJlZ2lvbl9Db250ZW50RnVsbFJlZ2lvbl9Db250ZW50TGVmdFJlZ2lvbl9DRVBHcm91cDFfQ0VQQWN0aXZlX0NNUENvZGVfYnRuQm9va05vd2QCAQ9kFgRmDxUCFkJvb2sgc3BvcnQgdHJhdmVsIGhlcmUeQ29ycG9yYXRlIGFncmVlbWVudCBjb2RlIChDTVApZAIDD2QWAmYPFQEEQm9va2QCIQ9kFgRmD2QWAgIBD2QWBAIBDw8WAh4NX2xhbmd1YWdlVGV4dAUZU2VsZWN0IFRyYXZlbCBQYXNzIG51bWJlcmRkAgMPZBYCAgEPDxYCHwoFDENsb3NlIHdpbmRvd2RkAgEPEA8WAh8DZ2RkFgBkAgIPZBYGAgEPDxYCHwoFBUxvZ2luZGQCAw8PFgIfCgUMQ2xvc2Ugd2luZG93ZGQCBw8PFgIfCQUFTG9naW5kZAIFD2QWBAIBDw8WBB8EaB4JX2xhc3RUeXBlBQdEZWZhdWx0ZGQCAw8WAh8IZxYCAgEPDxYEHwRoHwsFB0RlZmF1bHRkZBgCBR5fX0NvbnRyb2xzUmVxdWlyZVBvc3RCYWNrS2V5X18WBQWWAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJHJvdW5kdHJpcAWTAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJG9uZXdheQWTAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJG9uZXdheQWUAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJG9wZW5qYXcFlAFjdGwwMCRGdWxsUmVnaW9uJE1haW5SZWdpb24kQ29udGVudFJlZ2lvbiRDb250ZW50RnVsbFJlZ2lvbiRDb250ZW50TGVmdFJlZ2lvbiRDRVBHcm91cDEkQ0VQQWN0aXZlJGNlcE5EUFJldkJvb2tpbmdBcmVhJGNlcHRyYXZlbFR5cGVTZWxlY3RvciRvcGVuamF3BXljdGwwMCRGdWxsUmVnaW9uJE1haW5SZWdpb24kQ29udGVudFJlZ2lvbiRDb250ZW50RnVsbFJlZ2lvbiRDb250ZW50TGVmdFJlZ2lvbiRDRVBHcm91cDEkQ0VQQWN0aXZlJGNoaWxkQ0VQTGlzdCRMZXZlbDJDRVBzDw9mZGSFe0sSB8Ui86oXGiv98w7z0QuN5w==");
        map.put("__VIEWSTATEGENERATOR", "CA0B0334");
        return map;
    }

    public static byte[] getByteArrayForOutputStream() throws Exception {
        String st = "POST /en/ HTTP/1.1" + "\n" +
                "Host: classic.flysas.com" + "\n" +
                "Connection: keep-alive" + "\n" +
                "Cache-Control: max-age=0" + "\n" +
                "Origin: https://classic.flysas.com" + "\n" +
                "Upgrade-Insecure-Requests: 1" + "\n" +
                "Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36" + "\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8" + "\n" +
                "Referer: https://classic.flysas.com/" + "\n" +
                "Accept-Language: en-US,en;q=0.9" + "\n" +
                "Cookie: NEW_SAS_SSO_LOGGEDIN=vst=true; ASP.NET_SessionId=i40xcb2aul5qf0552myga1zb; WT_FPC=id=28c9e522003c085f4231537729700290:lv=1537729700290:ss=1537729700290; _ga=GA1.2.280149821.1537736901; _gid=GA1.2.1382577827.1537736901; _gat=1; SASLastSearch=%7B%22origin%22:%22OSL+%22,%22destination%22:%22RIX%22,%22outward%22:%2220181008%22,%22inward%22:%2220181014%22,%22adults%22:%221%22,%22children%22:%220%22,%22infants%22:%220%22,%22youths%22:%22NaN%22,%22lpc%22:%22false%22,%22oneway%22:%22false%22,%22rtf%22:%22false%22,%22rcity%22:%22false%22%7D" + "\n" +
                "Accept-Encoding: gzip, deflate" + "\n" +
                "Content-Length: 13823" + "\n" +

                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"__EVENTTARGET\"" + "\n" +

                "ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$Searchbtn$ButtonLink" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"__EVENTARGUMENT\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$TopRegion$_siteHeader$hdnProfilingConsent\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$TopRegion$_siteHeader$hdnTermsConsent\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$uid\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$pwd\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$hdnShowModal\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$hdnIsEb0\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$ceptravelTypeSelector$TripTypeSelector\"" + "\n" +
                "\n" +
                "roundtrip" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenIntercont\"" + "\n" +
                "\n" +
                "False" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenDomestic\"" + "\n" +
                "\n" +
                "NO,LV" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFareType\"" + "\n" +
                "\n" +
                "A" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtFrom\"" + "\n" +
                "\n" +
                "Oslo, Norway - Gardermoen (OSL+)" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFrom\"" + "\n" +
                "\n" +
                "OSL+" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtTo\"" + "\n" +
                "\n" +
                "Riga, Latvia - Riga (RIX)" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenTo\"" + "\n" +
                "\n" +
                "RIX" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtFromTOJ\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFromTOJ\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenOutbound\"" + "\n" +
                "\n" +
                "2018-10-08" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenReturn\"" + "\n" +
                "\n" +
                "2018-10-14" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hdnSelectedOutboundMonth\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hdnSelectedReturnMonth\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenReturnCalVisible\"" + "\n" +
                "\n" +
                "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenStoreCalDates\"" + "\n" +
                "\n" +
                "Sun Sep 23 2018 00:00:00 GMT+0300 (Eastern European Summer Time),Sun Sep 23 2018 00:00:00 GMT+0300 (Eastern European Summer Time),Tue Sep 17 2019 00:00:00 GMT+0300 (Eastern European Summer Time)" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$selectOutbound\"" + "\n" +
                "\n" +
                "2018-09-01" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$selectReturn\"" + "\n" +
                "\n" +
                "2018-10-01" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$FlexDateSelector\"" + "\n" +
                "\n" +
                "Show selected dates" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeAdult\"" + "\n" +
                "\n" +
                "1" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeChild211\"" + "\n" +
                "\n" +
                "0" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeInfant\"" + "\n" +
                "\n" +
                "0" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepNdpFareTypeSelector$ddlFareTypeSelector\"" + "\n" +
                "\n" +
                "A" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$hdnsetDefaultValue\"" + "\n" +
                "\n" +
                "true" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$hdncalendarDropdown\"" + "\n" +
                "\n" +
                "true" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"__PREVIOUSPAGE\"" + "\n" +
                "\n" +
                "3aoIK5urOF6qLmjEUVWoe7Zlok_H7Ef8UkS2oCFR_Ccg24aQSIRhidbF3PGeuRmIFTuiGxx8ealPNKfgqBWh77mCC2k1" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"__VIEWSTATE\"" + "\n" +
                "\n" +
                "/wEPDwUJNjIyMTczODM5D2QWAmYPZBYCAgEQZGQWAgIBD2QWAgICD2QWAgIDD2QWAgICD2QWBAIBD2QWAgIBD2QWAmYPZBYEZg8WAh4FY2xhc3MFCWFjdGl2ZUNFUBYWZg8VAQtCb29rIGEgdHJpcGQCBQ8PZBYCHgtDRVBQYWdlRGF0YQUXRVBpU2VydmVyLkNvcmUuUGFnZURhdGFkAgsPD2QWAh4TTm90aWZpY2F0aW9uQ29udHJvbAUuQVNQLnNhc190ZW1wbGF0ZXNfdXRpbF9ub3RpZmljYXRpb25kaWFsb2dfYXNjeBYIAgUPZBYCAgEPEA8WAh4LXyFEYXRhQm91bmRnZGQWAGQCCQ8PFgQeC19pc0VkaXRhYmxlaB4JX3BhZ2VMaW5rKClsRVBpU2VydmVyLkNvcmUuUGFnZVJlZmVyZW5jZSwgRVBpU2VydmVyLCBWZXJzaW9uPTYuMS4zNzkuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj04ZmU4M2RlYTczOGI0NWI3BjIxNTQ1NGRkAgoPZBYCZg9kFgQCAQ8WAh4Fc3R5bGUFDmRpc3BsYXk6IGJsb2NrFgICAQ8WAh4JaW5uZXJodG1sBT88c3R5bGU+DQouYWN0aXZlQ0VQe3otaW5kZXg6MTAwOyBwb3NpdGlvbjpyZWxhdGl2ZX0NCjwvc3R5bGU+DQpkAgMPEA8WAh8DZ2RkFgBkAgsPFQI+aHR0cDovL2NsYXNzaWMuZmx5c2FzLmNvbS9kZWZhdWx0LmFzcHg/aWQ9NiZhbXA7ZXBzbGFuZ3VhZ2U9ZW4FUmVzZXRkAg0PDxYCHgdWaXNpYmxlZxYCHwIFLkFTUC5zYXNfdGVtcGxhdGVzX3V0aWxfbm90aWZpY2F0aW9uZGlhbG9nX2FzY3gWDAIDD2QWAmYPFgIfCGcWAgIBD2QWAmYPZBYCZg9kFgYCAQ9kFgJmDxYCHgRUZXh0BbYBPGxhYmVsIGZvcj0iY3RsMDBfRnVsbFJlZ2lvbl9NYWluUmVnaW9uX0NvbnRlbnRSZWdpb25fQ29udGVudEZ1bGxSZWdpb25fQ29udGVudExlZnRSZWdpb25fQ0VQR3JvdXAxX0NFUEFjdGl2ZV9jZXBORFBSZXZCb29raW5nQXJlYV9jZXB0cmF2ZWxUeXBlU2VsZWN0b3Jfcm91bmR0cmlwIj5Sb3VuZCB0cmlwPC9sYWJlbD5kAgMPZBYCZg8WAh8JBbABPGxhYmVsIGZvcj0iY3RsMDBfRnVsbFJlZ2lvbl9NYWluUmVnaW9uX0NvbnRlbnRSZWdpb25fQ29udGVudEZ1bGxSZWdpb25fQ29udGVudExlZnRSZWdpb25fQ0VQR3JvdXAxX0NFUEFjdGl2ZV9jZXBORFBSZXZCb29raW5nQXJlYV9jZXB0cmF2ZWxUeXBlU2VsZWN0b3Jfb25ld2F5Ij5PbmUgd2F5PC9sYWJlbD5kAgUPZBYCZg8WAh8JBcIBPGxhYmVsIGZvcj0iY3RsMDBfRnVsbFJlZ2lvbl9NYWluUmVnaW9uX0NvbnRlbnRSZWdpb25fQ29udGVudEZ1bGxSZWdpb25fQ29udGVudExlZnRSZWdpb25fQ0VQR3JvdXAxX0NFUEFjdGl2ZV9jZXBORFBSZXZCb29raW5nQXJlYV9jZXB0cmF2ZWxUeXBlU2VsZWN0b3Jfb3BlbmphdyI+UmV0dXJuIGZyb20gYW5vdGhlciBjaXR5PC9sYWJlbD5kAgYPFgIfCGcWAgIBDxAPFgIfA2dkDxYCZgIBFgIQBRdTaG93IGEgbW9udGhseSBjYWxlbmRhcgUXU2hvdyBhIG1vbnRobHkgY2FsZW5kYXJnEAUTU2hvdyBzZWxlY3RlZCBkYXRlcwUTU2hvdyBzZWxlY3RlZCBkYXRlc2dkZAIHDxYCHwhoZAIID2QWAmYPZBYGAgEPEA8WAh8DZ2RkZGQCAg8QDxYCHwNnZGRkZAIDDxAPFgIfA2dkZGRkAgkPZBYCZg9kFgQCAQ8WAh8GBQ5kaXNwbGF5OiBibG9jaxYCAgEPFgIfBwU/PHN0eWxlPg0KLmFjdGl2ZUNFUHt6LWluZGV4OjEwMDsgcG9zaXRpb246cmVsYXRpdmV9DQo8L3N0eWxlPg0KZAIDDxAPFgIfA2dkZGRkAgoPFQIsL3RlbXBsYXRlcy9DRVAuYXNweD9pZD0yMTU0NTQmZXBzbGFuZ3VhZ2U9ZW4FUmVzZXRkAg8PD2QWAh8CBS5BU1Auc2FzX3RlbXBsYXRlc191dGlsX25vdGlmaWNhdGlvbmRpYWxvZ19hc2N4FgoCBA9kFgRmD2QWBGYPFQEbVHJhdmVsIFBhc3MgbnVtYmVyIGluIHVzZSA6ZAIDD2QWAmYPFQEZQ2hhbmdlIFRyYXZlbCBQYXNzIG51bWJlcmQCAg9kFgQCAQ8QDxYCHwkFGEJvb2sgYXMgYSB0cmF2ZWwgbWFuYWdlcmRkZGQCAw8QDxYCHwkFEU9ubHkgbWUgdHJhdmVsaW5nZGRkZAIID2QWCmYPFQEGU2VsZWN0ZAIDDxAWAh8DZ2QUKwEAZAIGDxAWAh8DZ2QUKwEAZAIKDxAWAh8DZ2QUKwEAZAINDxAWAh8DZ2QUKwEAZAIOD2QWAgICDxUMCVRyYXZlbGVycxBTZWxlY3QgdHJhdmVsZXJzBUNsb3NlEFNlbGVjdCB0cmF2ZWxlcnMNaXMgdHJhdmVsbGluZwNZZXMCTm8TTnVtYmVyIG9mIHRyYXZlbGVycwhUcmF2ZWxlcg5Ob25lIHRvIHNlbGVjdAZTZWxlY3QCT0tkAhAPZBYCZg9kFgQCAQ8WAh8GBQ5kaXNwbGF5OiBibG9jaxYCAgEPFgIfBwU/PHN0eWxlPg0KLmFjdGl2ZUNFUHt6LWluZGV4OjEwMDsgcG9zaXRpb246cmVsYXRpdmV9DQo8L3N0eWxlPg0KZAIDDxAPFgIfA2dkZBYAZAIRDxUCLC90ZW1wbGF0ZXMvQ0VQLmFzcHg/aWQ9MjE1NDU0JmVwc2xhbmd1YWdlPWVuBVJlc2V0ZAIRDw9kFgIfAgUuQVNQLnNhc190ZW1wbGF0ZXNfdXRpbF9ub3RpZmljYXRpb25kaWFsb2dfYXNjeBYGAgYPZBYEZg8VARtUcmF2ZWwgUGFzcyBudW1iZXIgaW4gdXNlIDpkAgMPZBYCZg8VARlDaGFuZ2UgVHJhdmVsIFBhc3MgbnVtYmVyZAIOD2QWAmYPZBYEAgEPFgIfBgUOZGlzcGxheTogYmxvY2sWAgIBDxYCHwcFPzxzdHlsZT4NCi5hY3RpdmVDRVB7ei1pbmRleDoxMDA7IHBvc2l0aW9uOnJlbGF0aXZlfQ0KPC9zdHlsZT4NCmQCAw8QDxYCHwNnZGQWAGQCDw8VAiwvdGVtcGxhdGVzL0NFUC5hc3B4P2lkPTIxNTQ1NCZlcHNsYW5ndWFnZT1lbgVSZXNldGQCEw8PZBYCHwIFLkFTUC5zYXNfdGVtcGxhdGVzX3V0aWxfbm90aWZpY2F0aW9uZGlhbG9nX2FzY3gWBAIMD2QWAmYPZBYCAgMPEA8WAh8DZ2RkFgBkAg0PZBYCZg8VAQ1Nb2RpZnkgc2VhcmNoZAIVDw9kFgIfAgUuQVNQLnNhc190ZW1wbGF0ZXNfdXRpbF9ub3RpZmljYXRpb25kaWFsb2dfYXNjeBYEAgsPZBYCZg9kFgICAw8QDxYCHwNnZGQWAGQCDA9kFgJmDxUBDU1vZGlmeSBzZWFyY2hkAhkPZBYCZg9kFgRmDxYCHwhoFgJmDxUBAGQCAQ8VAQBkAh8PZBYEZg8VAnRjdGwwMF9GdWxsUmVnaW9uX01haW5SZWdpb25fQ29udGVudFJlZ2lvbl9Db250ZW50RnVsbFJlZ2lvbl9Db250ZW50TGVmdFJlZ2lvbl9DRVBHcm91cDFfQ0VQQWN0aXZlX0NNUENvZGVfYnRuQm9va05vd3RjdGwwMF9GdWxsUmVnaW9uX01haW5SZWdpb25fQ29udGVudFJlZ2lvbl9Db250ZW50RnVsbFJlZ2lvbl9Db250ZW50TGVmdFJlZ2lvbl9DRVBHcm91cDFfQ0VQQWN0aXZlX0NNUENvZGVfYnRuQm9va05vd2QCAQ9kFgRmDxUCFkJvb2sgc3BvcnQgdHJhdmVsIGhlcmUeQ29ycG9yYXRlIGFncmVlbWVudCBjb2RlIChDTVApZAIDD2QWAmYPFQEEQm9va2QCIQ9kFgRmD2QWAgIBD2QWBAIBDw8WAh4NX2xhbmd1YWdlVGV4dAUZU2VsZWN0IFRyYXZlbCBQYXNzIG51bWJlcmRkAgMPZBYCAgEPDxYCHwoFDENsb3NlIHdpbmRvd2RkAgEPEA8WAh8DZ2RkFgBkAgIPZBYGAgEPDxYCHwoFBUxvZ2luZGQCAw8PFgIfCgUMQ2xvc2Ugd2luZG93ZGQCBw8PFgIfCQUFTG9naW5kZAIFD2QWBAIBDw8WBB8EaB4JX2xhc3RUeXBlBQdEZWZhdWx0ZGQCAw8WAh8IZxYCAgEPDxYEHwRoHwsFB0RlZmF1bHRkZBgCBR5fX0NvbnRyb2xzUmVxdWlyZVBvc3RCYWNrS2V5X18WBQWWAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJHJvdW5kdHJpcAWTAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJG9uZXdheQWTAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJG9uZXdheQWUAWN0bDAwJEZ1bGxSZWdpb24kTWFpblJlZ2lvbiRDb250ZW50UmVnaW9uJENvbnRlbnRGdWxsUmVnaW9uJENvbnRlbnRMZWZ0UmVnaW9uJENFUEdyb3VwMSRDRVBBY3RpdmUkY2VwTkRQUmV2Qm9va2luZ0FyZWEkY2VwdHJhdmVsVHlwZVNlbGVjdG9yJG9wZW5qYXcFlAFjdGwwMCRGdWxsUmVnaW9uJE1haW5SZWdpb24kQ29udGVudFJlZ2lvbiRDb250ZW50RnVsbFJlZ2lvbiRDb250ZW50TGVmdFJlZ2lvbiRDRVBHcm91cDEkQ0VQQWN0aXZlJGNlcE5EUFJldkJvb2tpbmdBcmVhJGNlcHRyYXZlbFR5cGVTZWxlY3RvciRvcGVuamF3BXljdGwwMCRGdWxsUmVnaW9uJE1haW5SZWdpb24kQ29udGVudFJlZ2lvbiRDb250ZW50RnVsbFJlZ2lvbiRDb250ZW50TGVmdFJlZ2lvbiRDRVBHcm91cDEkQ0VQQWN0aXZlJGNoaWxkQ0VQTGlzdCRMZXZlbDJDRVBzDw9mZGSFe0sSB8Ui86oXGiv98w7z0QuN5w==" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK" + "\n" +
                "Content-Disposition: form-data; name=\"__VIEWSTATEGENERATOR\"" + "\n" +
                "\n" +
                "CA0B0334" + "\n" +
                "------WebKitFormBoundaryzVibvmmVT8bhiCoK--";
        return st.getBytes("UTF-8");
    }
}
