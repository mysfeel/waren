sample
===
* 注释

	select #use("cols")# from sys_user  where  #use("condition")#

cols
===
	id,version,loginname,password,mobile,email,create_time,update_time

updateSample
===
	
	id=#id#,version=#version#,loginname=#loginname#,password=#password#,mobile=#mobile#,email=#email#,create_time=#createTime#,update_time=#updateTime#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(version)){
	 and version=#version#
	@}
	@if(!isEmpty(loginname)){
	 and loginname=#loginname#
	@}
	@if(!isEmpty(password)){
	 and password=#password#
	@}
	@if(!isEmpty(mobile)){
	 and mobile=#mobile#
	@}
	@if(!isEmpty(email)){
	 and email=#email#
	@}
	@if(!isEmpty(createTime)){
	 and create_time=#createTime#
	@}
	@if(!isEmpty(updateTime)){
	 and update_time=#updateTime#
	@}
	
	