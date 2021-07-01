<template>
    <div>
        <form action="">
            <label>제목</label>
            <input type="text" name="">
            <hr>
            <label>내용</label>
            <textarea name="content" cols="30" rows="10">

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
            axios.get('/board/new/create')
            
        }
    },
}
</script>