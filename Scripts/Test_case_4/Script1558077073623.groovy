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

WebUI.openBrowser('Edurary.com')

WebUI.click(findTestObject('Sign_in/Page_EduRary  Home/a_Sign In'))

WebUI.setText(findTestObject('My_course_signin/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('My_course_signin/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Featured_course_learning_tab/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_signin/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Teaching_tab/Page_EduRary  My Courses/a_Teaching'))

WebUI.click(findTestObject('Any_Course_teaching_tab/Page_EduRary  My Courses/img_Private_image-3'))

WebUI.click(findTestObject('Guest_priview_Any_course/Page_EduRary  Create Course/a_As Guest'))

