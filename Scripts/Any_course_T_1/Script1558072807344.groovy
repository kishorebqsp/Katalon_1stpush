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

WebUI.click(findTestObject('Signin_edu/Page_/a_Sign In'))

WebUI.setText(findTestObject('Email_tb/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('Passwordtb/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Submit_button/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('My_course_button/Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Teaching_button/Page_EduRary  My Courses/a_Teaching'))

WebUI.click(findTestObject('Dotnet_course_tab/Page_EduRary  My Courses/img_Make a copy_image-3'))

WebUI.click(findTestObject('Live_class_settings_tab/Page_EduRary  Create Course/span_ Live Class Settings'))

WebUI.click(findTestObject('Yes_radio_button/Page_EduRary  Create Course/div_Yes'))

WebUI.click(findTestObject('Live.Skillrary_radio_button/Page_EduRary  Create Course/div_LiveSkillrary'))

WebUI.click(findTestObject('Once_radio_button/Page_EduRary  Create Course/div_Once'))

WebUI.setText(findTestObject('Live_class_start_tb/Page_EduRary  Create Course/input_When will the Live Class Start_coursedate'), 
    '2019-04-29 13:00:00', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Enrollment_close_date/Page_EduRary  Create Course/input_When will the enrollment close_courselastdate'), 
    '2019-04-30 13:00:00')

WebUI.click(findTestObject('Save_button_tab/Page_EduRary  Create Course/input_When will the enrollment close_btn btn-color'))

WebUI.click(findTestObject('Curriculum_tab/Page_EduRary  Create Course/span_ Curriculum'))

WebUI.click(findTestObject('Start_here_tb/Page_EduRary  Create Course/label_Start Here'))

WebUI.setText(findTestObject('Start_here_text_box/Page_EduRary  Create Course/input_Start Here_chcountfield su_course_update_section_textbox'), 
    'chem1')

WebUI.click(findTestObject('Tick_mark_button/Page_EduRary  Create Course/div_Start Here_updatesection'))

WebUI.click(findTestObject('Add_quiz_button/Page_EduRary  Create Course/div_Add Quiz'))

WebUI.click(findTestObject('Basics_tab/Page_EduRary  Create Course/span_  Basics'))

WebUI.setText(findTestObject('Sub_title/Page_EduRary  Create Course/textarea_huycgdcucnc'), 'ugadsuydgawjhd uawgdwadad')

WebUI.click(findTestObject('Save_button/Page_EduRary  Create Course/input_When will the enrollment close_btn btn-color'))

WebUI.click(findTestObject('Details/Page_EduRary  Create Course/span_  Details'))

WebUI.setText(findTestObject('Course_summary/Page_EduRary  Create Course/label_Course Summary'), 'hudwg wudigdw wugda uwag uwd hudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg hudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwd wudigdw wugda uwag uwdhudwg wudigdw wugda uwag c dcvs scd uwdhudwg dfvswudigdw wugda uwag uwdhudwg wudigdw wugda uwag uwd')

WebUI.setText(findTestObject('Course_goal/Page_EduRary  Create Course/input__course_goal'), 'Studies')

WebUI.click(findTestObject('Add_button/Page_EduRary  Create Course/input__course_goal_btn'))

WebUI.setText(findTestObject('Intended_audience_tb/Page_EduRary  Create Course/input__int_audience'), 'All')

WebUI.click(findTestObject('Add_button/Page_EduRary  Create Course/input__course_goal_btn'))

WebUI.setText(findTestObject('Course_requirements_tb/Page_EduRary  Create Course/input__course_req'), 'Any')

WebUI.click(findTestObject('Add_button/Page_EduRary  Create Course/input__course_goal_btn'))

WebUI.click(findTestObject('Instruction_level/Page_EduRary  Create Course/div_Introductory         Intermediate       Advanced     All Levels (Comprehensive)'))

WebUI.click(findTestObject('Save_button/Page_EduRary  Create Course/input_When will the enrollment close_btn btn-color'))

WebUI.click(findTestObject('Image_tab/Page_EduRary  Create Course/span_  Image'))

WebUI.click(findTestObject('Save_image_button/Page_EduRary  Create Course/i__cropControlCrop'))

WebUI.click(findTestObject('Submitted_for_reapproval_tab/Page_EduRary  Create Course/a_Submitted for re-approval'))

