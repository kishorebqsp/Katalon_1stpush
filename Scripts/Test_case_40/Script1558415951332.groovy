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

WebUI.click(findTestObject('Teaching_button/Page_EduRary  My Courses/a_Teaching'))

WebUI.click(findTestObject('Create_assessment_button/Page_EduRary  My Courses/a_Create Assessment'))

WebUI.delay(5)

WebUI.setText(findTestObject('Assessment_name_tb/Page_EduRary  My Courses/input_Assessment Name_assessmentname'), 'java')

WebUI.setText(findTestObject('Assessment_slug_tb/Page_EduRary  My Courses/input_Assessment Slug_assessmentslug'), 'java1')

WebUI.click(findTestObject('Create_button/Page_EduRary  My Courses/button_Create'))

WebUI.click(findTestObject('Image_tab/Page_EduRary  Create Course/span_  Image'))

WebUI.click(findTestObject('Choose_img/Page_EduRary  Create Course/div_Add  Change Image ( Minimum allowed size is 650px400px )  Use gif jpg jpeg or png file                    Choose An Image File            Cancel'))

