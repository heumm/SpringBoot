<template>
  <div class="about">
    <h1>This is an about page</h1>
        <div v-for="(data,i) in datas" :key="i">
            <p v-if="data != null">{{i}}: {{data}}</p>
        </div>
  </div>

  
</template>


<script>
//import axios from 'axios'
export default {
    name: 'About',
    data() {
        return {
            datas: null
        }
    },
    mounted: 
        function(){
          axios.get('https://api.github.com/users/heumm').then(res => {
            console.log(res);
            this.datas = res.data;
          }).catch(err => {
              console.log(err);
          })
        },
}

</script>

<style>
</style>
