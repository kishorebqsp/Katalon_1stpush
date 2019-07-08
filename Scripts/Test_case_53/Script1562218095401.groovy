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

WebUI.click(findTestObject('Signup/Page_EduRary  Home/a_Sign Up'))

WebUI.setText(findTestObject('Signup_username/Page_/input__username'), 'Sagar')

WebUI.setText(findTestObject('Signup_email_id/Page_/input__email'), 'sagar@gmail.com')

WebUI.setText(findTestObject('Signup_mob_num/Page_/input_land Islands_phone'), '9801970219')

WebUI.setText(findTestObject('Signup_password/Page_/input__password'), 'abc123')

WebUI.setText(findTestObject('Signup_confirm_pwd/Page_/input__password_confirmation'), 'abc123')

WebUI.click(findTestObject('Signup_button/Page_/button_Sign Up'))

