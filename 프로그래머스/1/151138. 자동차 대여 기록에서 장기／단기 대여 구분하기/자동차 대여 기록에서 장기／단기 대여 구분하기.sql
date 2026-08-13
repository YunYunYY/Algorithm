-- 코드를 입력하세요
SELECT HISTORY_ID,CAR_ID,START_DATE,END_DATE,if(datediff(end_date, start_Date)+1 >=30, "장기 대여", "단기 대여") as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY where MONTH(START_DATE)=9 and year(start_date)=2022 
order by history_id desc;