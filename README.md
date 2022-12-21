# fhtw_bic3_slm_marketingapi

This Program starts a simple server with a REST API, which returns the corresponding grad to the percentage value:

- \>= 88: **1**
- 75 - 87: **2**
- 63 - 74: **3**
- 50 - 62: **4**
- < 50: **5**

Example Call: http://localhost:8080/convert_percentage_to_grade?percentage=87