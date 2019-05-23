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

WebUI.delay(5)

WebUI.click(findTestObject('My_course_signin/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Teaching_tab/Page_EduRary  My Courses/a_Teaching'))

WebUI.click(findTestObject('Create_assessment/Page_EduRary  My Courses/a_Create Assessment'))

WebUI.setText(findTestObject('enter_asmnt_name_txt_field/Page_EduRary  My Courses/input_Assessment Name_assessmentname'), 
    'dominos568')

WebUI.setText(findTestObject('enter_asmnt_slug_txt_field/Page_EduRary  My Courses/input_Assessment Slug_assessmentslug'), 
    'dominos1784')

WebUI.click(findTestObject('Create_btn_Create_asmnt/Page_EduRary  My Courses/button_Create'))

WebUI.delay(5)

WebUI.click(findTestObject('Curriculum_course_content/Page_EduRary  Create Course/span_ Curriculum'))

WebUI.click(findTestObject('Add_content_btn_curriculum/Page_EduRary  Create Course/input_Introduction_lecture_add_content'))

WebUI.click(findTestObject('Doc_Addcontent_curclm/Page_EduRary  Create Course/span_Document'))

WebUI.click(findTestObject('Extrnl_resource_addcontent_curiclm/Page_EduRary  Create Course/div_External Resource'))

WebUI.delay(5)

WebUI.setText(findTestObject('enter_title_txt_field_ER_AC_Curiclm/Page_EduRary  Create Course/input_Title_exres_title'), 
    'wow')

WebUI.setText(findTestObject('Enter_link_txtfield_ER_AC_Curriculm/Page_EduRary  Create Course/input_Link_exres_link'), 'http://fb.com')

WebUI.click(findTestObject('Add_link_btn_Ext_resource_AC_Curiclm/Page_EduRary  Create Course/input_Link_su_course_add_res_link_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Del_Ext_resource_AC_Curiculum/Page_EduRary  Create Course/del_option_ext_resourc'))

