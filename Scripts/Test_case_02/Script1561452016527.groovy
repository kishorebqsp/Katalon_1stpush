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

WebUI.scrollToPosition(1, 2)

WebUI.click(findTestObject('Image_01/Page_My course page meta title/img_Test_image-3'))

WebUI.click(findTestObject('Add_discussion_button/Page_Test meta/button_Add Discussion'))

WebUI.setText(findTestObject('Add_discussion_text/Page_Test meta/input_Add Discussion_posttitle'), 'hello')

WebUI.setText(findTestObject('Add_discussion_body/Page_Test meta/body_gasyygdayuguagwuid(tinymce)'), 'ugduyeyeduahgdugwa')

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Add_discussion_select/Page_Test meta/select_--Select lecture--Lecture 1 IntroductionLecture 2 demo'), 
    'Lecture 1 Introduction', false)

WebUI.delay(10)

WebUI.click(findTestObject('Post_button/Page_Test meta/button_Post'))

