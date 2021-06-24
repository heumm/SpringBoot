<template>
  <div>
  

  <div class="menu">
    <router-link :to="a" v-for="a in menu" :key="a" >{{a}}</router-link>
    <!-- key는 반복문 돌린 요소를 컴퓨터가 구분하기 위해 쓴다. -->
  </div>
<router-view/>
</div>
</template>



<script>


export default {
  name: 'App',
  data(){
    return{
      menu : ['home', 'shop', 'about', 'board']
    }
  }

}
</script>

<style>

body {
  margin: 0;
}

div {
  box-sizing: border-box;
}



#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}


.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: white;
  padding: 10px;
  text-align: center;
}

</style>
