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

WebUI.click(findTestObject('Signin_edu/Page_/a_Sign In'))

WebUI.setText(findTestObject('Email_tb/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('Passwordtb/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_button/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Teaching_tab/Page_My course page meta title/a_Teaching'))

WebUI.click(findTestObject('Assessment_name_tb/Page_EduRary  My Courses/a_Create Assessment'))

WebUI.delay(5)

WebUI.setText(findTestObject('Assessment_name_tb/Page_EduRary  My Courses/input_Assessment Name_assessmentname'), 'hduduuebd')

WebUI.setText(findTestObject('Assessment_slug_tb/Page_EduRary  My Courses/input_Assessment Slug_assessmentslug'), 'uguwwdbg')

WebUI.click(findTestObject('Create_button/Page_EduRary  My Courses/button_Create'))

WebUI.delay(10)

WebUI.click(findTestObject('Curriculum_tab/Page_Create Course/span_ Curriculum'))

WebUI.click(findTestObject('Start_here_tb/Page_EduRary  Create Course/label_Start Here'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Start_here_det/Page_EduRary  Create Course/input_Start Here_chcountfield su_course_update_section_textbox'), 
    'abcd')

WebUI.click(findTestObject('Tick_mark/Page_Create Course/div_Start Here_updatesection'))

WebUI.click(findTestObject('Add_Assessment_bt/Page_Create Course/span_Add Assessment'))

WebUI.setText(findTestObject('Add_title/Page_Create Course/input__su_course_add_quiz_textbox'), 'abcde')

