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

WebUI.click(findTestObject('Signin_edu/Page_/a_Sign In'))

WebUI.setText(findTestObject('Email_tb/Page_/input__email'), email)

WebUI.setText(findTestObject('Passwordtb/Page_/input__password'), password)

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_button/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Teaching_button/Page_EduRary  My Courses/a_Teaching'))

WebUI.click(findTestObject('Skillrary_course/Page_EduRary  My Courses/img_Make a copy_image-3'))

WebUI.click(findTestObject('Basics_tab/Page_EduRary  Create Course/span_  Basics'))

WebUI.setText(findTestObject('Subtitle_det/Page_EduRary  Create Course/textarea_SubTitle_subtitle'), 'abcdefgh')

WebUI.click(findTestObject('Save_button/Page_EduRary  Create Course/input_When will the enrollment close_btn btn-color'))

