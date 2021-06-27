<template>
    <div>
        <h1>Board</h1>
        <table>
            <tr>
                <td>{{usergit}}</td>
            </tr>

        </table>
    </div>
</template>



<script>
// import usergitdata from '@/assets/gitdata.js'


// import Vue from 'https://unpkg.com/vue'
// url (required), options (optional)
// fetch('https://api.github.com/users/heumm', {
//     method: 'get'
// }).then(function(response) {
//     // console.log(response)
//     response.json()
// }).then((data) => console.log(data))
// .catch(function(err) {
//     // Error :(
//         console.log("error:(")
// });
fetch('https://api.github.com/users/heumm', {
    method: 'get'
}).then((response) => response.json())
.then((data) => console.log(data))
.catch(function(err) {
    // Error :(
        console.log("error:(")
});
 
export default {
    data() {
        return {
        }
    },
}
</script>

