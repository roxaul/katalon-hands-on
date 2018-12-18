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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('VerificarConsulta/a_Make Appointment (1)'))

WebUI.setText(findTestObject('VerificarConsulta/input_Username_username (1)'), '')

WebUI.setEncryptedText(findTestObject('VerificarConsulta/input_Password_password (1)'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.setText(findTestObject('VerificarConsulta/input_Username_username (1)'), '')

WebUI.click(findTestObject('VerificarConsulta/form_Demo account'))

WebUI.setText(findTestObject('VerificarConsulta/input_Username_username (1)'), 'John Doe')

WebUI.click(findTestObject('VerificarConsulta/button_Login (1)'))

WebUI.selectOptionByValue(findTestObject('VerificarConsulta/select_Tokyo CURA Healthcare C (1)'), 'Seoul CURA Healthcare Center', 
    true)

WebUI.setText(findTestObject('VerificarConsulta/input_Visit Date (Required)_vi (1)'), '29/09/1993')

WebUI.setText(findTestObject('VerificarConsulta/textarea_Comment_comment (1)'), 'teste passado')

WebUI.setText(findTestObject('VerificarConsulta/input_Visit Date (Required)_vi (1)'), '29/09/1500')

WebUI.click(findTestObject('VerificarConsulta/button_Book Appointment (1)'))

WebUI.check(findTestObject('VerificarConsulta/div_Appointment Confirmation (1)'))

WebUI.click(findTestObject('VerificarConsulta/a_Go to Homepage (1)'))

WebUI.click(findTestObject('VerificarConsulta/a_CURA Healthcare_menu-toggle (1)'))

WebUI.click(findTestObject('VerificarConsulta/a_History (1)'))

WebUI.check(findTestObject('VerificarConsulta/div_29091500'))

WebUI.click(findTestObject('VerificarConsulta/a_Go to Homepage (1)'))

WebUI.closeBrowser()

