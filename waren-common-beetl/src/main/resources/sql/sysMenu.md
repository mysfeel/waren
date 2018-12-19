sample
===
* 注释

	select #use("cols")# from sys_menu  where  #use("condition")#

cols
===
	id,version,icon,identifier,name,parent_id,sort,type,url

updateSample
===
	
	id=#id#,version=#version#,icon=#icon#,identifier=#identifier#,name=#name#,parent_id=#parentId#,sort=#sort#,type=#type#,url=#url#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(version)){
	 and version=#version#
	@}
	@if(!isEmpty(icon)){
	 and icon=#icon#
	@}
	@if(!isEmpty(identifier)){
	 and identifier=#identifier#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(parentId)){
	 and parent_id=#parentId#
	@}
	@if(!isEmpty(sort)){
	 and sort=#sort#
	@}
	@if(!isEmpty(type)){
	 and type=#type#
	@}
	@if(!isEmpty(url)){
	 and url=#url#
	@}
	
	