SELECT a.PATIENT_ID, a.P_FIRST_NAME, a.P_AGE, b.APP_NUMBER, b.APP_DATE FROM PATIENT a, APPOINMENT b
WHERE a.PATIENT_ID = b.PATIENT_ID
AND b.APP_REASON = 'FEVER'
ORDER BY a.PATIENT_ID;