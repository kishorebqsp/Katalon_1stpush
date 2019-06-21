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

WebUI.openBrowser(url)

WebUI.click(findTestObject('Sign_in/Page_EduRary  Home/a_Sign In'))

WebUI.setText(findTestObject('Email_Signin_txtbox/Page_/input__email'), email)

WebUI.setText(findTestObject('Pw_Signin_TB/Page_/input__password'), password)

WebUI.click(findTestObject('Submit_Signin_btn/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_signin/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Teaching_tab/Page_EduRary  My Courses/a_Teaching'))

WebUI.click(findTestObject('Create_assessment/Page_EduRary  My Courses/a_Create Assessment'))

WebUI.delay(3)

WebUI.setText(findTestObject('enter_asmnt_name_txt_field/Page_EduRary  My Courses/input_Assessment Name_assessmentname'), 
    'frog')

WebUI.setText(findTestObject('enter_asmnt_slug_txt_field/Page_EduRary  My Courses/input_Assessment Slug_assessmentslug'), 
    'frog')

WebUI.click(findTestObject('Create_btn_Create_asmnt/Page_EduRary  My Courses/button_Create'))

WebUI.delay(3)

WebUI.click(findTestObject('GettingStartedSurvey/Page_EduRary  Create Course/span_ Getting Started Survey'))

WebUI.click(findTestObject('SaveButton_GettingStartedSurvey/Page_EduRary  Create Course/input_Do you have subscribers on YouTube_btn btn-color'))

