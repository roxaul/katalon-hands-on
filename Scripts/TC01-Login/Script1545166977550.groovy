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

WebUI.click(findTestObject('Object Repository/MarcaConsulta/a_Make Appointment'))

WebUI.setEncryptedText(findTestObject('Object Repository/MarcaConsulta/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.setText(findTestObject('Object Repository/MarcaConsulta/input_Username_username'), 'John Doe')

WebUI.click(findTestObject('Object Repository/MarcaConsulta/button_Login'))

WebUI.click(findTestObject('Object Repository/MarcaConsulta/label_Apply for hospital readm'))

WebUI.setText(findTestObject('Object Repository/MarcaConsulta/input_Visit Date (Required)_vi'), '29/09/1993')

WebUI.setText(findTestObject('Object Repository/MarcaConsulta/textarea_Comment_comment'), 'teste123 oj ogo')

WebUI.click(findTestObject('Object Repository/MarcaConsulta/button_Book Appointment'))

WebUI.check(findTestObject('Object Repository/MarcaConsulta/div_Appointment Confirmation'))

WebUI.click(findTestObject('Object Repository/MarcaConsulta/a_Go to Homepage'))

