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

WebUI.click(findTestObject('Email_Signin_txtbox/Page_EduRary  Home/a_Sign In'))

WebUI.delay(5)

WebUI.setText(findTestObject('Email_Signin_txtbox/Page_/input__email'), 'yashsahay99@gmail.com')

WebUI.setText(findTestObject('Pw_Signin_TB/Page_/input__password'), '9801970219')

WebUI.click(findTestObject('Submit_Signin_btn/Page_/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_EduRary  Courses/a_my course'))

WebUI.click(findTestObject('Featured_course_learning_tab/Page_EduRary  My Courses/img_Private_image-3'))

WebUI.click(findTestObject('Rate_course_btn_featuredCourse/Page_EduRary  Course/button_Rate Course'))

WebUI.delay(3)

WebUI.click(findTestObject('Star_rating(2)_Rate_course/Page_EduRary  Course/img'))

WebUI.setText(findTestObject('your_review_textfield/Page_EduRary  Course/textarea_Your Review _reviewmsg'), 'good')

WebUI.click(findTestObject('Add_review_btn_RateCourse_btn/Page_EduRary  Course/button_Add Review'))

WebUI.delay(3)

WebUI.click(findTestObject('Rate_course_btn_featuredCourse/Page_EduRary  Course/button_Rate Course'))

WebUI.click(findTestObject('Star_rating(2)_Rate_course/Page_EduRary  Course/img'))

WebUI.setText(findTestObject('your_review_textfield/Page_EduRary  Course/textarea_Your Review _reviewmsg'), '        very good')

WebUI.click(findTestObject('Update_review_btn_Rate_course/Page_EduRary  Course/button_Update Review'))

WebUI.delay(3)

WebUI.click(findTestObject('Rate_course_btn_featuredCourse/Page_EduRary  Course/button_Rate Course'))

WebUI.click(findTestObject('Del_review_btn_rate_course/Page_EduRary  Course/button_Delete Review'))

