<template>
    <div>
        <form  @submit.prevent="insertArticle">
            <label>제목</label>
            <input type="text"  v-model="title">
            <hr>
            <label>내용</label>
            <textarea  v-model="content" cols="30" rows="10">

            </textarea>
            <br>
            <button>글쓰기</button>

        </form>
        
    </div>
    <!-- <div v-for="(data,i) in article" :key="i">
            <p v-if="data != null">{{i}}: {{data}}</p>
    </div> -->
</template>

<script>
export default {
    data(){
        return{
            title: 'test',
            content: '1234',
        }
        
    },


    methods: {
        insertArticle: function(){
            console.log("title = " + this.title);
            console.log("content = " + this.content);
            axios.post('/create', {
                title: this.title,
                content: this.content,
                
                // headers: { 'Content-Type': 'multipart/form-data'},
            }).then(res => {    //컨트롤러에서 받아온 응답
                console.log(res.data);  //컨트롤러 response data
                this.$router.push('/home');
            }).catch(err =>{
                console.log(err);
            });
            
        }
    },
}
</script>