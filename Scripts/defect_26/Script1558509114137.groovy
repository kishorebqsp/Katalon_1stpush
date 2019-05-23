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

WebUI.click(findTestObject('Sign_in/Page_EduRary  Home/a_Sign In'))

WebUI.setText(findTestObject('Email_Signin_txtbox/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('Pw_Signin_TB/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Submit_Signin_btn/Page_/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('My_course_signin/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Teaching_tab/Page_EduRary  My Courses/a_Teaching'))

WebUI.click(findTestObject('Create_assessment/Page_EduRary  My Courses/a_Create Assessment'))

WebUI.delay(5)

WebUI.setText(findTestObject('enter_asmnt_name_txt_field/Page_EduRary  My Courses/input_Assessment Name_assessmentname'), 
    'google2')

WebUI.setText(findTestObject('enter_asmnt_slug_txt_field/Page_EduRary  My Courses/input_Assessment Slug_assessmentslug'), 
    'google12')

WebUI.click(findTestObject('Create_btn_Create_asmnt/Page_EduRary  My Courses/button_Create'))

WebUI.click(findTestObject('Curriculum_course_content/Page_EduRary  Create Course/span_ Curriculum'))

WebUI.click(findTestObject('Add_content_btn_curriculum/Page_EduRary  Create Course/input_Introduction_lecture_add_content'))

WebUI.delay(3)

WebUI.click(findTestObject('Doc_Addcontent_curclm/Page_EduRary  Create Course/span_Document'))

WebUI.delay(3)

WebUI.click(findTestObject('AddFromLib_AddContent_Curriculum/Page_EduRary  Create Course/div_Add from Library'))

