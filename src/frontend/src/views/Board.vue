<template>
    <div>
        <h1>Board</h1>
        <table>
            <tr>
                <td></td>
            </tr>

        </table>
    </div>
</template>



<script>
import usergitdata from 'https://api.github.com/users/heumm'

export default {
    data() {
        return {
            usergit : usergitdata
        }
    },
}
</script>

