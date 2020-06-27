import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\USER\\Downloads\\NiceDay Coaching Therapy_v1.1.9_apkpure.com.apk', false)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - Create new account'), 0)

Mobile.setText(findTestObject('Registration/android.widget.EditText0 - First Name'), 'Timoti', 0)

Mobile.setText(findTestObject('Registration/android.widget.EditText0 - Last Name'), 'Rompas', 0)

Mobile.setText(findTestObject('Registration/android.widget.EditText0 - Email Address'), 'katalon.timoti@gmail.com', 0)

Mobile.setText(findTestObject('Registration/android.widget.EditText0 - Password'), 'Jakarta@2018', 0)

Mobile.tap(findTestObject('Registration/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Registration/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Registration/android.view.ViewGroup0 (2)'), 0)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - Create new account (1)'), 0)

Mobile.tap(findTestObject('Registration/android.view.ViewGroup0 (3)'), 0)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Registration/android.view.ViewGroup0 (3)'), 0)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Registration/android.view.ViewGroup0 (4)'), 0)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - I would like to get in contact with a professional but I dont know who yet.'), 
    0)

Mobile.tap(findTestObject('Registration/android.widget.TextView0 - Continue'), 0)

Mobile.closeApplication()

