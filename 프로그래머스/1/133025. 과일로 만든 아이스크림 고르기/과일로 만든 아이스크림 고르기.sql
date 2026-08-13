-- 코드를 입력하세요
SELECT F.FLAVOR
FROM FIRST_HALF F,ICECREAM_INFO I
where ingredient_type="fruit_based" and total_order>=3000 and F.FLAVOR=I.FLAVOR
order by total_order desc
;