(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d21abe1"],{bd8a:function(t,e,n){"use strict";n.r(e);var o=n("7a23"),l=Object(o["g"])("label",null,"제목",-1),c=Object(o["g"])("hr",null,null,-1),i=Object(o["g"])("label",null,"내용",-1),a=Object(o["g"])("br",null,null,-1),r=Object(o["g"])("button",null,"글쓰기",-1);function u(t,e,n,u,s,b){return Object(o["p"])(),Object(o["d"])("div",null,[Object(o["g"])("form",{action:"/create",method:"post",onSubmit:e[3]||(e[3]=Object(o["C"])((function(){return b.insertArticle&&b.insertArticle.apply(b,arguments)}),["prevent"]))},[l,Object(o["B"])(Object(o["g"])("input",{type:"text",name:"title","onUpdate:modelValue":e[1]||(e[1]=function(e){return t.title=e})},null,512),[[o["y"],t.title]]),c,i,Object(o["B"])(Object(o["g"])("textarea",{name:"content","onUpdate:modelValue":e[2]||(e[2]=function(e){return t.content=e}),cols:"30",rows:"10"},"\n\n            ",512),[[o["y"],t.content]]),a,r],32)])}var s={methods:{insertArticle:function(){console.log(this.title),console.log(this.content);var t=new FormData;axios.post("/create",{method:"post",data:t,title:this.title,content:this.content}).then((function(t){console.log(t.data)})).catch((function(t){console.log(t)}))}}};s.render=u;e["default"]=s}}]);
//# sourceMappingURL=chunk-2d21abe1.4285bb2a.js.map