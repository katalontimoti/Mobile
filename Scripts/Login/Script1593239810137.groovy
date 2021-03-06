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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\NiceDay Coaching Therapy_v1.1.9_apkpure.com.apk', true)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - Login'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText0 - Email Address'), 'katalon.timoti@gmail.com', 
    0)

Mobile.setText(findTestObject('Login/android.widget.EditText0 - Password'), 'Jakarta@2018', 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - Login (1)'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - Skip'), 0)

Mobile.tap(findTestObject('Login/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Login/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - I would like to get in contact with a professional but I dont know who yet.'), 
    0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - SOUNDS GOOD'), 0)

Mobile.closeApplication()

