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

WebUI.click(findTestObject('Browse_course/Page_EduRary  Courses/a_Browse Course'))

WebUI.click(findTestObject('Assessment_button/Page_EduRary  Courses/a_Assessment'))

WebUI.click(findTestObject('Assessment_on_laravel/Page_EduRary  Assessment Category/img_assessment_image-3'))

WebUI.click(findTestObject('Resume_quiz/Page_EduRary  Course/a_resume   quiz'))

WebUI.click(findTestObject('Start_quiz/Page_Take Course/a_Start Quiz'))

WebUI.click(findTestObject('10_opt/Page_Take Course/li_appHttp'))

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.click(findTestObject('Next_question/Page_Take Course/button_Next Question'))

WebUI.click(findTestObject('10_opt/Page_Take Course/li_Initialize a Laraval application'))

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.click(findTestObject('Next_question/Page_Take Course/button_Next Question'))

