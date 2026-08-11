-- 코드를 작성해주세요
select concat(max(ifnull(length,0)),'cm') as MAX_LENGTH from fish_Info;