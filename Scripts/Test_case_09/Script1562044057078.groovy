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

WebUI.click(findTestObject('Image_03/Page_My course page meta title/img_Make a copy_image-3'))

WebUI.delay(5)

WebUI.click(findTestObject('Details_tab/Page_Create Course/span_  Details'))

WebUI.setText(findTestObject('Course_Summary/Page_Create Course/body_id(tinymce)'), 'jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf jhduy yugduyw yuegu yuegfu uyegf uyegf ')

WebUI.setText(findTestObject('Course_goal/Page_Create Course/input__course_goal'), 'All')

WebUI.click(findTestObject('Add_button/Page_Create Course/input__course_goal_btn'))
