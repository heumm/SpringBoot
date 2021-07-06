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
            console.log("testfunction insertArticle");
            console.log(this.title);
            console.log(this.content);
            // const form = new FormData();
            // console.log(form);
            axios.post('/create', {
                // method: 'post',
                // url: '/create',
                // data: form,
                title: this.title,
                content: this.content,
                
                // headers: { 'Content-Type': 'multipart/form-data'},
            }).then(res => {
                console.log(res.data);
            }).catch(err =>{
                console.log(err);
            });
            
        }
    },
}
</script>