<template>
    <div>
        <form @submit.prevent="insertArticle">
            <label>제목</label>
            <input type="text" name="title" v-model="title">
            <hr>
            <label>내용</label>
            <textarea name="content" v-model="content" cols="30" rows="10">

            </textarea>
            <br>
            <button>글쓰기</button>

        </form>

    </div>
</template>

<script>
export default {
    
    methods: {
        insertArticle: function(){
            console.log(this.title);
            console.log(this.content);
            const form = new FormData();
            axios.post('/create', {
                method: 'post',
                // url: '/create',
                data: form,
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