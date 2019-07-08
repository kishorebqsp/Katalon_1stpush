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

WebUI.click(findTestObject('Signin_edu/Page_EduRary  Home/a_Sign In'))

WebUI.setText(findTestObject('Email_tb/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('Passwordtb/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_button/Page_Courses/a_my course'))

WebUI.click(findTestObject('Teaching_tab/Page_My course page meta title/a_Teaching'))

WebUI.scrollToPosition(1, 3)

WebUI.click(findTestObject('Image_04/Page_My course page meta title/img_Make a copy_image-3'))

WebUI.click(findTestObject('Curriculum_tab/Page_Create Course/span_ Curriculum'))

WebUI.click(findTestObject('Add_lecture_button/Page_EduRary  Create Course/span_Add Lecture'))

WebUI.setText(findTestObject('Add_lecture_textbox/Page_Create Course/input__su_course_add_lecture_textbox'), 'abc')

WebUI.click(findTestObject('Add_lecture_button/Page_EduRary  Create Course/input_YesNo_su_course_add_lecture_submit'))

WebUI.click(findTestObject('Add_description_button/Page_Create Course/input_abc_lecture_add_content'))

WebUI.delay(10)

WebUI.setText(findTestObject('Add_description_textbox/Page_Create Course/p'), 'jhsagdytfdcseayt')

WebUI.click(findTestObject('Save_button/Page_EduRary  Create Course/input_When will the enrollment close_btn btn-color'))

WebUI.click(findTestObject('Add_content_button/Page_Create Course/input_Introduction_lecture_add_content'))

WebUI.click(findTestObject('Text_button/Page_Create Course/span_Text'))

WebUI.setText(findTestObject('Text_box/Page_EduRary  Create Course/input_Start Here_chcountfield su_course_update_section_textbox'), 
    'ifhueufgufgue')

WebUI.click(findTestObject('Save_button/Page_EduRary  Create Course/input_When will the enrollment close_btn btn-color'))

WebUI.click(findTestObject('Publish_button/Page_Create Course/input_Youtube ID_lecture_publish_content'))

