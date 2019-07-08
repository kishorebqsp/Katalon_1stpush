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

WebUI.setText(findTestObject('Email_tb/Page_/input__email'), 'pradeep@gmail.com')

WebUI.setText(findTestObject('Passwordtb/Page_/input__password'), 'abc123')

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.click(findTestObject('Courses_tab/Page_EduRary  Courses/a_courses'))

WebUI.delay(10)

WebUI.click(findTestObject('Trending_view_all/Page_Courses/a_view all'))

WebUI.scrollToPosition(1, 3)

WebUI.click(findTestObject('Page_2/Page_Most Viewed/a_2'))

WebUI.scrollToPosition(1, 2)

WebUI.click(findTestObject('Course_6/Page_Most Viewed/img_(11)_image-3'))

