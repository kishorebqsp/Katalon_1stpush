import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('edurary.com')

WebUI.click(findTestObject('Signin_edu/Page_EduRary  Home/a_Sign In'))

WebUI.setText(findTestObject('Email_tb/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('Passwordtb/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_button/Page_Courses/a_my course'))

WebUI.click(findTestObject('Teaching_tab/Page_My course page meta title/a_Teaching'))

WebUI.click(findTestObject('Create_course/Page_EduRary  My Courses/a_Create Course'))

WebUI.delay(5)

WebUI.setText(findTestObject('course_name/Page_EduRary  My Courses/input_What do you want to teach_coursename'), 'Computer')

WebUI.click(findTestObject('Yess/Page_My course page meta title/input_Yes_coursetype_sel'))

WebUI.setText(findTestObject('Course_slug_create_c/Page_EduRary  My Courses/input_Course Slug_slug'), 'copmputer1')

WebUI.click(findTestObject('Create_button_cc/Page_EduRary  My Courses/button_Create'))

WebUI.click(findTestObject('Live_class_settings_tab/Page_EduRary  Create Course/span_ Live Class Settings'))

WebUI.click(findTestObject('Yess/Page_My course page meta title/input_Yes_coursetype_sel'))

WebUI.delay(5)

WebUI.click(findTestObject('Live.skillrary_radio_buttn/Page_Create Course/input_LiveSkillrary_meeting_type'))

WebUI.delay(10)

WebUI.click(findTestObject('Daily_radio_button/Page_Create Course/input_Daily_coursefreq_sel'))

WebUI.delay(5)

WebUI.click(findTestObject('Date_from_click/Page_Create Course/input_Date From_coursedatefrom'))

WebUI.delay(10)

WebUI.click(findTestObject('Date_01/Page_Create Course/td_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Date_to_click/Page_Create Course/input_To Date_coursedateto'))

WebUI.delay(5)

WebUI.click(findTestObject('Date_3/Page_Create Course/td_3'))

WebUI.delay(5)

WebUI.click(findTestObject('Starting_time_click/Page_Create Course/input_Starting Time_coursetime'))

WebUI.click(findTestObject('Starting_time_12/Page_Create Course/span_1200'))

WebUI.click(findTestObject('Starting_time_12_25/Page_Create Course/span_1225'))

WebUI.click(findTestObject('class_dur/Page_Create Course/select_-- Select Duration-- 30 Minutes1 Hour1 Hour 30 Minutes2 Hour2 H'))

WebUI.click(findTestObject('Enrollment_close_date/Page_Create Course/input_When will the enrollment close_courselastdate'))

WebUI.click(findTestObject('Enroll_close_date_5/Page_Create Course/td_5'))

WebUI.click(findTestObject('Save_button/Page_EduRary  Create Course/input_When will the enrollment close_btn btn-color'))

