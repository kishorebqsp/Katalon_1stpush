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

WebUI.click(findTestObject('Sign_in/Page_EduRary  Home/a_Sign In'))

WebUI.setText(findTestObject('Email_Signin_txtbox/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('Pw_Signin_TB/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Submit_Signin_btn/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Browse_course_Edu_home_page/Page_EduRary  Courses/a_Browse Course'))

WebUI.click(findTestObject('assessment_browse_couse_EHpage/Page_EduRary  Courses/a_Assessment'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_signin/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Assessment_tab_MyCourse/Page_EduRary  My Courses/a_Assessment'))

WebUI.delay(5)

