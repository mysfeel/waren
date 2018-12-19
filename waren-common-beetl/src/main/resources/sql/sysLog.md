sample
===
* 注释

	select #use("cols")# from sys_log  where  #use("condition")#

cols
===
	uuid,version,user_id,type,content,create_time

updateSample
===
	
	uuid=#uuid#,version=#version#,user_id=#userId#,type=#type#,content=#content#,create_time=#createTime#

condition
===

	1 = 1  
	@if(!isEmpty(uuid)){
	 and uuid=#uuid#
	@}
	@if(!isEmpty(version)){
	 and version=#version#
	@}
	@if(!isEmpty(userId)){
	 and user_id=#userId#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	@if(!isEmpty(content)){
	 and content=#content#
	@}
	@if(!isEmpty(createTime)){
	 and create_time=#createTime#
	@}
	
	