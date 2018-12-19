sample
===
* 注释

	select #use("cols")# from sys_config  where  #use("condition")#

cols
===
	id,version,description,value

updateSample
===
	
	id=#id#,version=#version#,description=#description#,value=#value#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(version)){
	 and version=#version#
	@}
	@if(!isEmpty(description)){
	 and description=#description#
	@}
	@if(!isEmpty(value)){
	 and value=#value#
	@}
	
	