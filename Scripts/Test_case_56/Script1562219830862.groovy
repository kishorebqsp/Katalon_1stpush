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

WebUI.click(findTestObject('Forgot_password/Page_/a_Forgot Password'))

WebUI.setText(findTestObject('Email_valid/Page_/input_Enter Your Email Address_credit_email'), 'yashsahay99@gmail.com')

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.openBrowser('gmail.com')

WebUI.setText(findTestObject('Email_gmail/Page_Gmail/input_Continue to Gmail_identifier'), 'yashsahay99@gmail.com')

WebUI.click(findTestObject('Next_button_gmail/Page_Gmail/span_Next'))

