select u.username, a.authority from authorities a left join users u on u.id = a.user_entry where u.username = 'admin'
